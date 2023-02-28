package com.xworkz.oven.controller;

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

import com.xworkz.oven.dto.MicrowaveDTO;
import com.xworkz.oven.service.MicrowaveService;

@Controller
@RequestMapping("/")
public class MicrowaveController {

	@Autowired
	private MicrowaveService microwaveService;

	private List<String> colors = Arrays.asList("Red", "Black", "White", "Blue");

	public MicrowaveController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/microwave")
	public String onMicrowave(Model model) {
		System.out.println("Running onMicrowave on get mapping");
		List<String> colors = Arrays.asList("Red", "Black", "White", "Blue");
		model.addAttribute("colors", colors);
		return "Microwave";
	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running on search for id " + id);
		MicrowaveDTO dto = this.microwaveService.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Data not found");
		}
		return "MicrowaveSearch";
	}

	@PostMapping("/microwave")
	public String onMicrowave(Model model, MicrowaveDTO dto) {
		System.out.println("Running onMicrowave on post mapping" + dto);
		Set<ConstraintViolation<MicrowaveDTO>> violations = this.microwaveService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("No violations in controler go to success page");
			return "Microwave";
		}
		model.addAttribute("colors", colors);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);
		System.err.println("Violations in controller");
		return "Microwave";
	}

	@GetMapping("/searchByName")
	public String onSearchByName(@RequestParam String name, Model model) {
		System.out.println("Running on search for name " + name);
		List<MicrowaveDTO> dto = this.microwaveService.findByName(name);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Data not found");
		}
		return "MicrowaveNameSearch";
	}
}
