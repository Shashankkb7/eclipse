package com.xworkz.follower;

import com.xworkz.rules.Person;
import com.xworkz.rules.XworkzRule;

public abstract class JavaTrainee extends Person implements XworkzRule {

	public JavaTrainee(String name, int age, double weight, String location, double height) {
		super(name, age, weight, location, height);
	}

	public abstract boolean training();

	public abstract boolean executeProgram();

	@Override
	public boolean uploadedTask() {
		System.out.println("Running upload task");
		return false;
	}

	@Override
	public boolean completedProgram() {
		System.out.println("Running completed program");
		return false;
	}

	public boolean eat() {
		System.out.println("Running eat");
		return false;
	}

	public boolean sleep() {
		System.out.println("Running sleep");
		return false;
	}

}
