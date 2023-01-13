package com.xworkz.autowired3.bean;

import org.springframework.stereotype.Component;

@Component
public class Area {

	public Area() {
		System.out.println("Created Area using no-arg const");
	}
}
