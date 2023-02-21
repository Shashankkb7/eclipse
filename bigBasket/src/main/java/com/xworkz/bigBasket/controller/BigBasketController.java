package com.xworkz.bigBasket.controller;

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

import com.xworkz.bigBasket.dto.BigBasketDTO;
import com.xworkz.bigBasket.service.BigBasketService;

@Controller
@RequestMapping("/bigBasket")
public class BigBasketController {
	@Autowired
	private BigBasketService basketService;

	private List<String> items = Arrays.asList("Ice cream", "Chips", "Biscuit", "Juice", "Chocolates");
	private List<String> areas = Arrays.asList("Rajajinagar", "Bhashyam circle", "Vijaynagar", "Basaveshwarnagar",
			"Mariyappanpalya");

	public BigBasketController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping
	public String onBigBasket(Model model) {
		System.out.println("Running onBigBasket on get mapping");
		List<String> items = Arrays.asList("Ice cream", "Chips", "Biscuit", "Juice", "Chocolates");
		List<String> areas = Arrays.asList("Rajajinagar", "Bhashyam circle", "Vijaynagar", "Basaveshwarnagar",
				"Mariyappanpalya");
		model.addAttribute("items", items);
		model.addAttribute("areas", areas);
		return "BigBasket";
	}

	@PostMapping
	public String onBigBasket(Model model, BigBasketDTO dto) {
		System.out.println("Running onBigBasket on post mapping" + dto);
		Set<ConstraintViolation<BigBasketDTO>> violations = this.basketService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("No violations in controler go to success page");
			model.addAttribute("name", dto.getName());
			model.addAttribute("ownerName", dto.getOwnerName());
			model.addAttribute("item", dto.getItem());
			model.addAttribute("area", dto.getArea());
			model.addAttribute("phNo", dto.getPhNo());
			model.addAttribute("email", dto.getEmail());
			model.addAttribute("password", dto.getPassword());
			model.addAttribute("noOfWorkers", dto.getNoOfWorkers());
			model.addAttribute("discount", dto.getDiscount());
			model.addAttribute("gstNo", dto.getGstNo());
			return "BigBasketSuccess";
		}
		model.addAttribute("items", items);
		model.addAttribute("areas", areas);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);
		System.err.println("violation in controller");
		return "BigBasket";
	}
}
