package com.xworkz.autowired2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.xworkz.autowired2.bean.Engine;
import com.xworkz.autowired2.bean.Snake;

@Configuration
@ComponentScan(basePackages = "com.xworkz.autowired2", excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = { EngineConfiguration.class,
				SnakeConfiguration.class, Engine.class, Snake.class }) })
public class NewsPaperConfiguration {

	public NewsPaperConfiguration() {
		System.out.println("Created NewsPaperConfiguration");
	}

	@Bean
	public int newsPaperId() {
		System.out.println("Registering newsPaperId");
		return 123;
	}

	@Bean
	public String newsPaperName() {
		System.out.println("Registering newsPaperName");
		return "Vijayavaani";
	}

	@Bean
	public String newsPaperOwnerName() {
		System.out.println("Registering newsPaperOwnerName");
		return "Vijay sankeshwar";
	}

	@Bean
	public String newsPaperLanguage() {
		System.out.println("Registering newsPaperLanguage");
		return "Kannada";
	}

	@Bean
	public double newsPaperPrice() {
		System.out.println("Registering newsPaperPrice");
		return 4.50;
	}
}
