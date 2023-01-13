package com.xworkz.autowired3.bean;

import org.springframework.stereotype.Component;

@Component
public class Assistant {

	public Assistant() {
		System.out.println("Created Assistant using no-arg const");
	}
}
