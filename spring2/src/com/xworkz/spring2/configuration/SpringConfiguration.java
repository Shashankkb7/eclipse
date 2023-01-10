package com.xworkz.spring2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring2.bean.Actor;
import com.xworkz.spring2.bean.Rocket;
import com.xworkz.spring2.bean.Season;

@Configuration
@ComponentScan("com.xworkz.spring2")
public class SpringConfiguration {

	public SpringConfiguration() {
		System.out.println("Created SpringConfiguration");
	}

	@Bean
	public Rocket spaceRocket() {
		System.out.println("Registering spaceRocket with spring");
		Rocket rocket = new Rocket();
		return rocket;
	}

	@Bean
	public Actor acting() {
		System.out.println("Registering acting with spring");
		Actor actor = new Actor("Allu arjun", "Telugu", 33);
		return actor;
	}

	@Bean
	public Season episodes() {
		System.out.println("Registering episodes with spring");
		Season season = new Season();
		season.setName("Winter");
		season.setDuration(2);
		season.setStartingMonth("March");
		return season;

	}
}
