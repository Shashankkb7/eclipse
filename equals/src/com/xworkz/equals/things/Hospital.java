package com.xworkz.equals.things;

public class Hospital {

	private String name;
	private String location;
	private String doctorName;
	private String doctorGender;
	private String type;
	private String hospitalTaluk;
	private String hospitalDistrict;
	private int pincode;
	private long phNo;
	private int noOfNurses;

	public Hospital() {
		System.out.println("default const of hospital");
	}

	public Hospital(String name, String location, String doctorName, String doctorGender, String type,
			String hospitalTaluk, String hospitalDistrict, int pincode, long phNo, int noOfNurses) {
		super();
		this.name = name;
		this.location = location;
		this.doctorName = doctorName;
		this.doctorGender = doctorGender;
		this.type = type;
		this.hospitalTaluk = hospitalTaluk;
		this.hospitalDistrict = hospitalDistrict;
		this.pincode = pincode;
		this.phNo = phNo;
		this.noOfNurses = noOfNurses;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals method in Hospital");
		if (obj instanceof Hospital) {
			System.out.println("other is Hospital,can check the properties");
			Hospital cast5 = (Hospital) obj;
			if (this.name.equals(cast5.name) && this.doctorName.equals(cast5.doctorName)
					&& this.location.equals(cast5.location) && this.doctorGender.equals(cast5.doctorGender)
					&& this.type.equals(cast5.type) && this.hospitalTaluk.equals(cast5.hospitalTaluk)
					&& this.hospitalDistrict.equals(cast5.hospitalDistrict)) {
				System.out
						.println("name,doctorName,location,doctorGender,type,hospitalTaluk,hospitalDistrict are same");
				return true;
			} else {
				System.err.println(
						"name,doctorName,location,doctorGender,type,hospitalTaluk,hospitalDistrict are not same");
				return false;
			}
		} else {
			System.err.println("other is not Hospital cannot check the properties");
		}
		return false;

	}

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", location=" + location + ", doctorName=" + doctorName + ", doctorGender="
				+ doctorGender + ", type=" + type + ", hospitalTaluk=" + hospitalTaluk + ", hospitalDistrict="
				+ hospitalDistrict + ", pincode=" + pincode + ", phNo=" + phNo + ", noOfNurses=" + noOfNurses + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorGender() {
		return doctorGender;
	}

	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHospitalTaluk() {
		return hospitalTaluk;
	}

	public void setHospitalTaluk(String hospitalTaluk) {
		this.hospitalTaluk = hospitalTaluk;
	}

	public String getHospitalDistrict() {
		return hospitalDistrict;
	}

	public void setHospitalDistrict(String hospitalDistrict) {
		this.hospitalDistrict = hospitalDistrict;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public int getNoOfNurses() {
		return noOfNurses;
	}

	public void setNoOfNurses(int noOfNurses) {
		this.noOfNurses = noOfNurses;
	}

}
