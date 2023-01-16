package com.xworkz.dependencyInjection.bean;

import org.springframework.stereotype.Component;

import com.xworkz.dependencyInjection.rules.Provider;

@Component
public class Airtel implements Provider {

	public Airtel() {
		System.out.println("Creating Airtel using no-arg const");
	}

	@Override
	public void connect() {
		System.out.println("Running connect in Airtel");

	}

}
