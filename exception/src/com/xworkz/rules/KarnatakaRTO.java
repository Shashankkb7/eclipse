package com.xworkz.rules;

public interface KarnatakaRTO extends TransportRule {

	@Override
	default double gst() {
		System.out.println("Running gst");
		return 0;
	}

	@Override
	default boolean paidTax(double amount) {
		System.out.println("Running paid tax");
		System.out.println(amount);
		return false;
	}

	double vat();
}
