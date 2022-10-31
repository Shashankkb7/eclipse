package com.xworkz.associations.array.thing;

import com.xworkz.associations.array.constants.Gender;

public class President {

	public String name;
	public int tenure;
	public Gender gender = Gender.MALE;

	public President(String name, int tenure, Gender gender) {
		this.name = name;
		this.tenure = tenure;
		this.gender = gender;
	}

	public void show0ff() {
		System.out.println(this.name);
		System.out.println(this.tenure);
		System.out.println(this.gender);
	}
}
