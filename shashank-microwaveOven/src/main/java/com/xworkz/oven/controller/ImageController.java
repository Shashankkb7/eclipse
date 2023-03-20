package com.xworkz.oven.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class ImageController {

	public ImageController() {
		log.info("Created " + this.getClass().getSimpleName());
	}
	
	@PostMapping("/upload")
	public String onUpload(@RequestParam("bhavaChitra") MultipartFile multipartFile,RedirectAttributes redirectAttributes) throws IOException {
		log.info("multipartFile "+multipartFile);
		log.info(multipartFile.getOriginalFilename());
		log.info(multipartFile.getContentType());
		log.info("Total size "+multipartFile.getSize());
		log.info("Total bytes "+multipartFile.getBytes());
		
		byte[] bytes = multipartFile.getBytes();
        Path path = Paths.get("E:\\microwave files\\" + multipartFile.getOriginalFilename());
        Files.write(path, bytes);      

        redirectAttributes.addFlashAttribute("message", 
                    "You successfully uploaded '" + multipartFile.getOriginalFilename() + "'");
		return "UploadImage";
	}
	
	@GetMapping("/download")
	public void onDownload(HttpServletResponse response,@RequestParam String fileName) throws IOException {
		response.setContentType("image/jpeg");
		File file=new File("E:\\microwave files\\" +fileName);
		InputStream inputStream= new BufferedInputStream(new FileInputStream(file));
		ServletOutputStream outputStream=response.getOutputStream();
		IOUtils.copy(inputStream, outputStream);
		response.flushBuffer();
	}
}
