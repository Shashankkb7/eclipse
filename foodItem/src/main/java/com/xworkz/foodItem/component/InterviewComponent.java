package com.xworkz.foodItem.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.foodItem.dto.InterviewDTO;

@Component
@RequestMapping("/job")
public class InterviewComponent {

	public InterviewComponent() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onAttend(InterviewDTO dto) {
		System.out.println("Running onAttend");
		System.out.println("Dto is " + dto);
		return "Interview.jsp";
	}
}
