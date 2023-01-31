package com.xworkz.prosperity.component;

import org.springframework.stereotype.Component;

@Component
public class RevengeComponent {

	public RevengeComponent() {
		System.out.println("created.." + this.getClass().getSimpleName());
	}
}
