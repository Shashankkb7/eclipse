package com.xworkz.shashank.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.shashank.dto.BeverageDTO;
import com.xworkz.shashank.dto.ChatDTO;
import com.xworkz.shashank.dto.EducationDTO;
import com.xworkz.shashank.dto.FamilyDTO;
import com.xworkz.shashank.dto.MobileDTO;

@Component
@RequestMapping("/")
public class DisplayButtonController {

	@GetMapping("/email")
	public String onEmail(Model model) {
		System.out.println("Running onEmail");
		model.addAttribute("emailId", "shashankkb7@gmail.com");
		return "index.jsp";
	}

	@GetMapping("/phone")
	public String onPhone(Model model) {
		System.out.println("Running onPhone");
		model.addAttribute("phoneNo", 9108120838L);
		return "index.jsp";
	}

	@GetMapping("/aadhar")
	public String onAadhar(Model model) {
		System.out.println("Running onAadhar");
		model.addAttribute("aadharNo", 102224508541L);
		return "index.jsp";
	}

	@GetMapping("/age")
	public String onAge(Model model) {
		System.out.println("Running onAge");
		model.addAttribute("age", 22);
		return "index.jsp";
	}

	@GetMapping("/dob")
	public String onDOB(Model model) {
		System.out.println("Running onDOB");
		model.addAttribute("dateOfBirth", LocalDateTime.of(2001, 01, 24, 06, 15));
		return "index.jsp";
	}

	@GetMapping("/salary")
	public String onSalary(Model model) {
		System.out.println("Running onSalary");
		model.addAttribute("desiredSalary", 26042.5D);
		return "index.jsp";
	}

	@GetMapping("/besties")
	public String onBesties(Model model) {
		System.out.println("Running onBesties");
		List<String> list = new ArrayList<String>();
		list.add("Nayana");
		list.add("Arun");
		list.add("Spoorthi");
		list.add("Neeraj");
		list.add("Uday");
		model.addAttribute("bestFriends", list);
		return "index.jsp";
	}

	@GetMapping("/places")
	public String onPlaces(Model model) {
		System.out.println("Running onPlaces");
		List<String> list = new ArrayList<String>();
		list.add("Mullayangiri");
		list.add("Honnavara");
		list.add("Gokarna");
		list.add("Mangalore");
		list.add("Kudremukh");
		model.addAttribute("mostVisited", list);
		return "index.jsp";
	}

	@GetMapping("/skills")
	public String onSkills(Model model) {
		System.out.println("Running onSkills");
		List<String> list = new ArrayList<String>();
		list.add("Core java");
		list.add("HTML");
		list.add("CSS");
		list.add("MySQL");
		model.addAttribute("skillSet", list);
		return "index.jsp";
	}

	@GetMapping("/beverage")
	public String onBeverage(Model model) {
		System.out.println("Running onBeverage");
		BeverageDTO beverageDTO = new BeverageDTO();
		beverageDTO.setName("Kinley");
		beverageDTO.setPrice(45.20);
		beverageDTO.setCold(true);
		beverageDTO.setColor("Black");
		beverageDTO.setQuality(true);
		beverageDTO.setQuantity(450.50);
		beverageDTO.setStock(false);
		beverageDTO.setDiscount(20.50D);
		model.addAttribute("beverageDTO", beverageDTO);
		return "index.jsp";
	}

	@GetMapping("/chat")
	public String onChat(Model model) {
		System.out.println("Running onChat");
		ChatDTO chatDTO = new ChatDTO();
		chatDTO.setName("Masal puri");
		chatDTO.setChatLocation("Rjajinagar");
		chatDTO.setOwnerName("Neeraj");
		chatDTO.setParcel(false);
		chatDTO.setPhNo(9874563214L);
		chatDTO.setPincode(578541);
		chatDTO.setPrice(50.50);
		chatDTO.setShopName("X-workz");
		chatDTO.setSpicy(true);
		chatDTO.setSweet(false);
		chatDTO.setTasty(true);
		model.addAttribute("chatDTO", chatDTO);
		return "index.jsp";
	}

	@GetMapping("/education")
	public String onEducation(Model model) {
		System.out.println("Running onEducation");
		EducationDTO educationDTO = new EducationDTO();
		educationDTO.setCollegeName("KIT");
		educationDTO.setAutonomus(false);
		educationDTO.setNoOfBranches(5);
		educationDTO.setPhNo(8745213690L);
		educationDTO.setPincode(572201);
		educationDTO.setPresidentName("Manjunath");
		educationDTO.setPrincipalName("Gurumurthy");
		educationDTO.setPrincipalPhNo(8520147963L);
		educationDTO.setSince(1961);
		educationDTO.setType("Engineering");
		model.addAttribute("educationDTO", educationDTO);
		return "index.jsp";
	}

	@GetMapping("/family")
	public String onFamily(Model model) {
		System.out.println("Running onFamily");
		FamilyDTO familyDTO = new FamilyDTO();
		familyDTO.setFamilyName("Rajkumar");
		familyDTO.setFatherName("Dr.Rajkumar");
		familyDTO.setGrandFatherAlive(false);
		familyDTO.setGrandMotherAlive(false);
		familyDTO.setMotherName("Parvathamam");
		familyDTO.setMotherPhNo(7841002338L);
		familyDTO.setNoOfMembers(6);
		familyDTO.setVillageName("Bangalore");
		familyDTO.setPhNo(7410325689L);
		familyDTO.setVillagePincode(789654);
		model.addAttribute("familyDTO", familyDTO);
		return "index.jsp";
	}

	@GetMapping("/mobile")
	public String onMobile(Model model) {
		System.out.println("Running onMobile");
		MobileDTO mobileDTO = new MobileDTO();
		mobileDTO.setName("Samsung");
		mobileDTO.setColor("Black");
		mobileDTO.setPrice(55040.50D);
		mobileDTO.setRAM(8);
		mobileDTO.setDualSim(true);
		model.addAttribute("mobileDTO", mobileDTO);
		return "index.jsp";
	}
}
