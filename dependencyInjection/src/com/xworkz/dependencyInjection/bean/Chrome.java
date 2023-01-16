package com.xworkz.dependencyInjection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.dependencyInjection.rules.Browser;
import com.xworkz.dependencyInjection.rules.Provider;

@Component
public class Chrome implements Browser {
	@Autowired
	@Qualifier("jio")
	private Provider provider;
	@Autowired
	@Qualifier("airtel")
	private Provider provider1;

	public Chrome() {
		System.out.println("Creating Chrome using no-arg");
	}

	@Override
	public void browse() {
		System.out.println("Running browse in Chrome");
		provider.connect();
		provider1.connect();
	}

}
