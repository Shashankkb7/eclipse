package com.xworkz.things;

public class Student {

	private String name = "Darshan";
	String collegeName = "KIT";
	String collegeLocation = "Tiptur";
	long phoneNumber = 9108120838L;
	String branch = "Civil engineering";
	String uSNNumber = "1KI18CV028";
	double height = 168;
	double weight = 66;
	int collegePincode = 572201;
	int fees = 85000;
	String principalName = "Gurumurthy";

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	void setCollegeLocation(String collegeLocation) {
		this.collegeLocation = collegeLocation;
	}

	void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	void setBranch(String branch) {
		this.branch = branch;
	}

	void setUSNNumber(String uSNNumber) {
		this.uSNNumber = uSNNumber;
	}

	void setHeight(double height) {
		this.height = height;
	}

	void setWeight(double weight) {
		this.weight = weight;
	}

	void setCollegePincode(int collegePincode) {
		this.collegePincode = collegePincode;
	}

	void setFees(int fees) {
		this.fees = fees;
	}

	void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

}
