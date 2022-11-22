package com.xworkz.equals.things;

public class Institution {

	private String name;
	private String owner;
	private String location;
	private String principalName;
	private String instituteDistrict;
	private String Chairman;
	private int since;
	private double fees;
	private long phNo;
	private int pincode;

	public Institution() {
		System.out.println("deault const of institution");
	}

	public Institution(String name, String owner, String location, String principalName, String instituteDistrict,
			String chairman, int since, double fees, long phNo, int pincode) {
		super();
		this.name = name;
		this.owner = owner;
		this.location = location;
		this.principalName = principalName;
		this.instituteDistrict = instituteDistrict;
		this.Chairman = chairman;
		this.since = since;
		this.fees = fees;
		this.phNo = phNo;
		this.pincode = pincode;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals method in Institution");
		if (obj instanceof Institution) {
			System.out.println("other is Institution,can check the properties");
			Institution cast5 = (Institution) obj;
			if (this.name.equals(cast5.name) && this.owner.equals(cast5.owner) && this.location.equals(cast5.location)
					&& this.principalName.equals(cast5.principalName)
					&& this.instituteDistrict.equals(cast5.instituteDistrict) && this.Chairman.equals(cast5.Chairman)) {
				System.out.println("name,owner,location,principalName, instituteDistrict and Chairman are same");
				return true;
			} else {
				System.err.println("name,owner,location,principalName,instituteDistrict and Chairman are not same");
				return false;
			}
		} else {
			System.err.println("other is not Institution cannot check the properties");
		}
		return false;

	}

	@Override
	public String toString() {
		return "Institution [name=" + name + ", owner=" + owner + ", location=" + location + ", principalName="
				+ principalName + ", instituteDistrict=" + instituteDistrict + ", Chairman=" + Chairman + ", since="
				+ since + ", fees=" + fees + ", phNo=" + phNo + ", pincode=" + pincode + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPrincipalName() {
		return principalName;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public String getInstituteDistrict() {
		return instituteDistrict;
	}

	public void setInstituteDistrict(String instituteDistrict) {
		this.instituteDistrict = instituteDistrict;
	}

	public String getChairman() {
		return Chairman;
	}

	public void setChairman(String chairman) {
		Chairman = chairman;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
