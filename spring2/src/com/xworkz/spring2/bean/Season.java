package com.xworkz.spring2.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {

	private String name;
	private double duration;
	private String startingMonth;

	public Season() {
		System.out.println("Creating Season using default const by Spring");
	}

	@Value("Vikings")
	public void setName(String name) {
		this.name = name;
	}

	@Value("25")
	public void setDuration(double duration) {
		this.duration = duration;
	}

	@Value("January")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}

	public String getName() {
		return name;
	}

	public double getDuration() {
		return duration;
	}

	public String getStartingMonth() {
		return startingMonth;
	}
}
