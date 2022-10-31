package com.xworkz.associations.array.thing;

public class Person {

	public String name;
	public Email[] email;
	public Job job;

	public Person(String name) {
		this.name = name;
	}

	public void setEmail(Email[] email) {
		this.email = email;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public void showOff() {
		System.out.println("person name is displaying:" + name);
		if (this.email != null) {
			for (int i = 0; i < email.length; i++) {
				Email email = this.email[i];
				if (email != null) {
					email.showOff();
				} else {
					System.out.println("element is null");
				}

			}
		} else {
			System.out.println("email is null");
		}
		if (this.job != null) {
			this.job.showOff();
		}
	}
}
