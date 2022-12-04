package com.xworkz.interfaces.governor;

import com.xworkz.interfaces.rules.BankRules;

public class RBI {

	private BankRules bank;

	public RBI() {
		System.out.println("default const of RBI.....");
	}

	public RBI(BankRules bank) {
		super();
		this.bank = bank;
	}

	public void check() {
		System.out.println("Running maintain and checking balance...");
		if (this.bank != null) {
			boolean maintain = this.bank.maintainMinBalance();
			double balance = this.bank.balance();
			if (maintain == true && balance == 1000) {
				System.out.println("SBIBank is follow the rules...");
			} else {
				System.out.println("SBIBank is not follow the rules...");
			}
		}
	}

}
