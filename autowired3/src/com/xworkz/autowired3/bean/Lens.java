package com.xworkz.autowired3.bean;

import org.springframework.stereotype.Component;

@Component
public class Lens {

	public Lens() {
		System.out.println("Created Lens using no-arg const");
	}
}
