package com.xworkz.foodItem.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.foodItem")
public class FoodItemConfiguration {

	public FoodItemConfiguration() {
		System.out.println("Created.." + this.getClass().getSimpleName());
	}
}
