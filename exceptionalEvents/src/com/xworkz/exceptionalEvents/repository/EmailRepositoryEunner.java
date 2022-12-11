package com.xworkz.exceptionalEvents.repository;

public class EmailRepositoryEunner {

	public static void main(String[] args) {

		EmailRepository email = new EmailRepositoryImplements();
		email.create("shashankkb.xworkz@gamil.com");
		email.create("arun.xworkz@gamil.com");
		email.create("sanjay.xworkz@gamil.com");
		email.create("ganesh.xworkz@gamil.com");
		email.create("manu.xworkz@gamil.com");
		email.create("darshan.xworkz@gamil.com");
		email.create("deepak.xworkz@gamil.com");
		email.create("uday.xworkz@gamil.com");
		email.create("varun.xworkz@gamil.com");
		email.create("vinay.xworkz@gamil.com");
		System.out.println(email.total());

	}

}
