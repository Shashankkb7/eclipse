package com.xworkz.rules.Runner;

import com.xworkz.rules.Hostel;
import com.xworkz.rules.bridge.HostelFollower;

public class HostelRunner {

	public static void main(String[] args) {

		Hostel hostel = new HostelFollower();
		hostel.boys();
		hostel.location();
		hostel.noOfStudents();
		hostel.warden();
		hostel.wearMask();
	}

}
