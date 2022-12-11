package com.xworkz.exceptionalEvents.repository;

import com.xworkz.exceptionalEvents.customException.EmailSizeExcededException;

public class EmailRepositoryImplements implements EmailRepository {

	private String[] emails = new String[10];
	private int emailIndex = 0;

	@Override
	public boolean create(String email) {
		System.out.println("Running create in Email repository");
		if (this.emailIndex >= this.emails.length) {
			throw new EmailSizeExcededException();
		}
		this.emails[emailIndex] = email;
		this.emailIndex++;
		return false;

	}

	public int total() {
		return this.emails.length;
	}

}
