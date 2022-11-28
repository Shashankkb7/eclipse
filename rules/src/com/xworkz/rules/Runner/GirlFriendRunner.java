package com.xworkz.rules.Runner;

import com.xworkz.rules.GirlFriend;
import com.xworkz.rules.bridge.BoyFriend;

public class GirlFriendRunner {

	public static void main(String[] args) {

		GirlFriend girl = new BoyFriend();
		girl.dateOfBirth();
		girl.education();
		girl.location();
		girl.modern();
		girl.name();
	}

}
