package com.xworkz.commonModules.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.ConstraintViolation;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.commonModules.dto.ApplicationDTO;
import com.xworkz.commonModules.dto.TechnologyDTO;
import com.xworkz.commonModules.service.ApplicationService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class ApplicationController {

	@Autowired
	private ApplicationService applicationService;

	public ApplicationController() {
		log.info("Created " + this.getClass().getSimpleName());
	}

	@PostMapping("/signUp")
	public String onSignUp(Model model, ApplicationDTO dto, String userId, String email, Long mobile) {
		log.info("Running onSignUp");
		Long count = this.applicationService.checkDuplicates(userId, email, mobile);
		if (count > 0) {
			log.error("Duplicates values is thier");
			model.addAttribute("Msg", "UserID or Email or MobileNo already exists");
		} else {
			Set<ConstraintViolation<ApplicationDTO>> violation = this.applicationService.validate(dto);
			if (violation.isEmpty()) {
				log.info("No Violation in controller");
				boolean saved = this.applicationService.saveService(dto);
				log.info("saved " + saved);
				model.addAttribute("message", "Registration Sucessfull");
				return "SignUp";
			} else {
				model.addAttribute("errors", violation);
				model.addAttribute("message1", "Registration failed");

			}
		}
		return "SignUp";
	}
//		log.info("Running onApplication on post mapping" + dto);
//
//		List<ApplicationDTO> dto1 = this.applicationService.findAllService();
//		for (ApplicationDTO Dto : dto1) {
//			if (dto.getUserId().equals(Dto.getUserId())) {
//				model.addAttribute("userMsg", "UserID already exists");
//				return "SignUp";
//			} else if (dto.getEmail().equals(Dto.getEmail())) {
//				model.addAttribute("emailMsg", "Email already exists");
//				return "SignUp";
//			} else if (dto.getMobile().equals(Dto.getMobile())) {
//				model.addAttribute("mobileMsg", "MobileNo already exists");
//				return "SignUp";
//			}
//
//		}
//		Set<ConstraintViolation<ApplicationDTO>> violations = this.applicationService.validate(dto);
//		if (!violations.isEmpty()) {
//			log.info("violations in controller go to index page");
//			model.addAttribute("msg", violations);
//		}
//
//		if (dto.getPassword().equals(dto.getConfirmPassword())) {
//			boolean saved = this.applicationService.saveService(dto);
//			log.info("Saved :" + saved);
//			model.addAttribute("dto", dto);
//
//			model.addAttribute("success", "SignedUp Successfully");
//			return "SignUp";
//		} else {
//			model.addAttribute("passwordMsg", "Password does not match");
//			return "SignUp";
//		}
//
//}

	@PostMapping("/signIn")
	public String onSignIn(Model model, @RequestParam String userId, @RequestParam String password,
			HttpServletRequest request) {
		log.info("Running on SignIn " + userId + password);
		try {
			ApplicationDTO dto = this.applicationService.findByUserAndPassword(userId, password);
			log.info("Login count " + dto.getLoginCount());
			if (dto.getLoginCount() >= 3) {
				log.info("Account locked for sign in reset password");
				model.addAttribute("lockMsg", "Account locked for sign in reset password");
				return "SignIn";
			}
			if (dto != null) {

				if (dto.isResetPassword() == true) {
					if (!dto.getLoginTime().isAfter(LocalTime.now())) {
						log.info("Running in time verifying condition");
						model.addAttribute("msgs", "Time out please reset password again");
						return "SignIn";
					}
					model.addAttribute("userID", dto.getUserId());
					log.info("Running in reset condition");
					log.info("ResetPassword---" + dto.isResetPassword());
					log.info("Timer-----" + dto.getLoginTime().isBefore(LocalTime.now()));
					return "UpdatePassword";
				}
				System.currentTimeMillis();
				log.info("UserId and password are match");
				HttpSession httpSession = request.getSession(true);
				httpSession.setAttribute("userId", dto.getUserId());
				httpSession.setAttribute("dtoPic", dto.getPicName());
				httpSession.setAttribute("dto", dto);
				return "LoginSuccess";
			}
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		log.info("UserID OR Password is not matching");
		model.addAttribute("message", "UserId or password are invalid");
		return "SignIn";
	}

	@PostMapping("/reset")
	public String reSetPassword(String email, Model model) {
		ApplicationDTO udto = this.applicationService.reSetPassword(email);
		if (udto.isResetPassword() == true) {
			log.info("Password reset sucessful plz login with in 2 min with otp");
			model.addAttribute("message1",
					"Password reset successful please login within 2 min otherwise password expired");
			return "ResetPassword";
		}
		return "ResetPassword";
	}

	@PostMapping("/updatePassword")
	public String upDatePassword(String userId, String password, String confirmPassword, Model model) {
		this.applicationService.updatePassword(userId, password, confirmPassword);
		model.addAttribute("message2", "Password Update successful");
		return "UpdatePassword";
	}

	@PostMapping("/upload")
	public String onUpload(@RequestParam("bhavaChitra") MultipartFile multipartFile, String userId, String email,
			Long mobile, Model model) throws IOException {
		log.info("multipartFile" + multipartFile);
		log.info(multipartFile.getOriginalFilename());
		log.info(multipartFile.getContentType());
		log.info("Size of file" + multipartFile.getSize());
		log.info("Size of byte" + multipartFile.getBytes());
		if (multipartFile.isEmpty()) {
			log.info("file uploading failed");
			model.addAttribute("error", "Please select file");
			return "ProfileUpdate";
		}
		model.addAttribute("success", "Image successfully uploaded");
		byte[] bytes = multipartFile.getBytes();
		Path path = Paths.get("E:\\projectPhoto\\" + userId + System.currentTimeMillis() + ".jpg");
		Files.write(path, bytes);
		String imageName = path.getFileName().toString();
		log.info("Image name--" + imageName);
		log.info("Image name in tostring--" + path.toString());
		log.info("Image file name--" + path.getFileName());
		this.applicationService.updateProfile(userId, email, mobile, imageName);
		return "ProfileUpdate";
	}

	@GetMapping("/download")
	public void onDownload(HttpServletResponse response, @RequestParam String fileName, ApplicationDTO appDto)
			throws IOException {
		Path path = Paths.get("E:\\projectPhoto\\" + appDto.getPicName());
		path.toFile();
		response.setContentType("image/jpeg");
		File file = new File("E:\\projectPhoto\\" + fileName);
		InputStream in = new BufferedInputStream(new FileInputStream(file));
		ServletOutputStream out = response.getOutputStream();
		IOUtils.copy(in, out);
		response.flushBuffer();

	}

	@GetMapping("/addTechnology")
	public String onTechnology(Model model, int id) {
		log.info("@getmapping addTechnology ,id " + id);
		ApplicationDTO dto = this.applicationService.findById(id);
		log.info("dto : " + dto);
		model.addAttribute("getUserId", dto.getUserId());
		model.addAttribute("id", id);
		return "Add";
	}

	@PostMapping("/addTechnology")
	public String onTechnology(Model model, TechnologyDTO dto, int id) {
		log.info("@PostMapping(/addtechnology) TechnologyDTO dto = " + dto + "  ID : " + id);
		dto.setId(id);
		ApplicationDTO dto1 = this.applicationService.findById(id);
		model.addAttribute("dto1", dto1);
		model.addAttribute("id", id);
		Set<ConstraintViolation<TechnologyDTO>> violations = this.applicationService.validateAndAddTechnology(dto);
		if (violations.isEmpty()) {
			log.info("There is no violations can add a technology");
			model.addAttribute("addTechSuccess", "Successfully added the technology : " + dto.getName());
			return "Add";
		}
		log.info("Violations in the technology, can't add it");
		model.addAttribute("error", violations);
		return "Add";
	}

	@GetMapping("/viewTechnology")
	public String onView(Model model, @RequestParam int id) {
		log.info("listTechnology " + id);
		ApplicationDTO dto = this.applicationService.findById(id);
		model.addAttribute("dto", dto);
		model.addAttribute("id", id);
		List<TechnologyDTO> dtos = this.applicationService.findByView(id);
		if (dtos.isEmpty()) {
			log.info("There is no technologies added");
			model.addAttribute("emptyTechnologies", "There is no technologies added");
			return "LoginSuccess";
		}
		log.info("dtos.size()" + dtos.size());
		model.addAttribute("dtos", dtos);
		return "Technologies";
	}

}
