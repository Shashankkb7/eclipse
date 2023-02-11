package com.xworkz.egg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.egg.dto.EggDTO;
import com.xworkz.egg.service.EggService;

@Controller
@RequestMapping("/egg")
public class EggController {
	@Autowired
	private EggService eggService;

	public EggController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onSend(EggDTO dto, Model model) {
		System.out.println("Running onSend " + dto);
		boolean saved = this.eggService.validateAndSave(dto);
		System.out.println("Saved in controller " + saved);
		return "Egg";
	}
}