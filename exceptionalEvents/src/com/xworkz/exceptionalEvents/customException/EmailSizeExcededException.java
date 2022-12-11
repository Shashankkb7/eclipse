package com.xworkz.exceptionalEvents.customException;

@SuppressWarnings("serial")
public class EmailSizeExcededException extends RuntimeException {

	public EmailSizeExcededException() {
		System.out.println("EmailSizeExcededException is created");
	}

}
