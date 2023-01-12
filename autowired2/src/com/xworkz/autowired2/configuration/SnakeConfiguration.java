package com.xworkz.autowired2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.xworkz.autowired2.bean.Engine;
import com.xworkz.autowired2.bean.NewsPaper;

@Configuration
@ComponentScan(basePackages = "com.xworkz.autowired2", excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = { EngineConfiguration.class,
				NewsPaperConfiguration.class, Engine.class, NewsPaper.class }) })
public class SnakeConfiguration {

	public SnakeConfiguration() {
		System.out.println("Created SnakeConfiguration");
	}

	@Bean
	public String snakeName() {
		System.out.println("Registering snakeName");
		return "Cobra";
	}

	@Bean
	public double snakeLength() {
		System.out.println("Registering snakeLength");
		return 10.50;
	}

	@Bean
	public String snakeColor() {
		System.out.println("Registering snakeColor");
		return "Green";
	}

	@Bean
	public String snakeType() {
		System.out.println("Registering snakeType");
		return "King Cobra";
	}

	@Bean
	public boolean snakeIsPoisonous() {
		System.out.println("Registering snakeIsPoisonous");
		return true;
	}
}
