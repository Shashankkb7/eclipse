package com.xworkz.autowired.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
	@Autowired
	@Qualifier("softwareName")
	private String name;
	@Autowired
	@Qualifier("softwareVersion")
	private double version;
	@Autowired
	@Qualifier("softwareDevelopedBy")
	private String developer;
	@Autowired
	@Qualifier("date")
	private LocalDate date;
	@Autowired
	@Qualifier("softwareIsFree")
	private boolean free;

	public Software() {
		System.out.println("Creating Software using default const by Spring");
	}

	@Override
	public String toString() {
		return "Software [name=" + name + ", version=" + version + ", developer=" + developer + ", date=" + date
				+ ", free=" + free + "]";
	}
}
