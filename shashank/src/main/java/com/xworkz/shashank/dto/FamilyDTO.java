package com.xworkz.shashank.dto;

import lombok.Data;

@Data
public class FamilyDTO {

	private String familyName;
	private String fatherName;
	private Long phNo;
	private String villageName;
	private String motherName;
	private Integer noOfMembers;
	private Integer villagePincode;
	private Long motherPhNo;
	private boolean grandFatherAlive;
	private boolean grandMotherAlive;
}
