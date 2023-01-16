package com.xworkz.dependencyInjection.bean;

import org.springframework.stereotype.Component;

import com.xworkz.dependencyInjection.rules.Provider;

@Component
public class Jio implements Provider {

	public Jio() {
		System.out.println("Creating Jio using no-arg const");
	}

	@Override
	public void connect() {
		System.out.println("Running connect in Jio");

	}

}
