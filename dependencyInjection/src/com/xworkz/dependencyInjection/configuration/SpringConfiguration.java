package com.xworkz.dependencyInjection.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.dependencyInjection")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("Creating SpringConfiguration");
	}

}
