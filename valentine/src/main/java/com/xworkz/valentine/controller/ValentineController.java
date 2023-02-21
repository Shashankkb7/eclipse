package com.xworkz.valentine.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.service.ValentineService;

@Controller
@RequestMapping("/")
public class ValentineController {

	@Autowired
	private ValentineService valentineService;

	private List<String> places = Arrays.asList("Cubbon park", "BTM", "Lalbagh", "Jp nagar");
	private List<String> gifts = Arrays.asList("Chocolates", "Rose", "Teddy", "I-Phone");

	public ValentineController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/valentine")
	public String onValentine(Model model) {
		System.out.println("Running onValentine Get method");
		List<String> places = Arrays.asList("Cubbon park", "BTM", "Lalbagh", "Jp nagar");
		List<String> gifts = Arrays.asList("Chocolates", "Rose", "Teddy", "I-Phone");
		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);
		return "Valentine";
	}
	
	@GetMapping("/search")
	public String onSearch(@RequestParam int id,Model model) {
		System.out.println("Running on search for id "+id);
		ValentineDTO dto=this.valentineService.findById(id);
		if(dto!=null) {
			model.addAttribute("dto",dto);
		}else {
			model.addAttribute("message","Data not found");
		}
		return "ValentineSearch";
	}

	@PostMapping("/valentine")
	public String onValentine(Model model, ValentineDTO dto) {
		System.out.println("Running onValentine Post method " + dto);
		Set<ConstraintViolation<ValentineDTO>> violations = this.valentineService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("No violations in controler go to success page");
			return "ValentineSuccess";
		}
		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);
		System.err.println("violation in controller");
		return "Valentine";
	}
}
