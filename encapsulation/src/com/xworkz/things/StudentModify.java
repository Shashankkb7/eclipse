package com.xworkz.things;

public class StudentModify {

	public void useStudent(Student student) {
		System.out.println("accessing Student Name:" + student.getName());
		student.setName("Vijay");
		System.out.println("accessing modfying Student Name:" + student.getName());
		System.out.println("Student college Location:" + student.branch);
		System.out.println("Student college Location:" + student.collegeLocation);
		System.out.println("Student college Name:" + student.collegeName);
		System.out.println("Student college Pincode:" + student.collegePincode);
		System.out.println("Student fees:" + student.fees);
		System.out.println("Student height:" + student.height);
		System.out.println("Student phone Number:" + student.phoneNumber);
		System.out.println("Student principal Name:" + student.principalName);
		System.out.println("Student uSNNumber:" + student.uSNNumber);
		System.out.println("Student weight:" + student.weight);
	}
}
