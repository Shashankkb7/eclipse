package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.follower.SBIBank;
import com.xworkz.interfaces.governor.RBI;
import com.xworkz.interfaces.rules.BankRules;

public class RBIRunner {

	public static void main(String[] args) {

		BankRules bank = new SBIBank();
		RBI rbi = new RBI(bank);
		rbi.check();
	}

}
