package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Birthday;
import com.xworkz.inheritance.things.Invitation;

public class InvitationRunner {

	public static void main(String[] args) {

		Invitation invitation = new Birthday("Birthday", "Paper", 1000);
		System.out.println("Invitation details");
		System.out.println(invitation.purpose);
		System.out.println(invitation.type);
		System.out.println(invitation.noOfCopies);

	}

}
