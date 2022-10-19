package com.xworkz.boot;

import com.xworkz.constructor.Committees;
import com.xworkz.constructor.FamousLecturers;

public class College {

	public String name;
	public String principalName;
	public int totalStudents;
	public boolean hostelFacility;
	public long phoneNumber;
	public int[] totalBrancheStudents;
	public String[] branchNames;
	public String[] collegeQuota;
	public double[] feesAmount;
	public Committees ANTI_RAGGING;
	public FamousLecturers SANTHOSH;
	
	public College(String name,String principalName,int totalStudents,boolean hostelFacility,long phoneNumber,int[] totalBrancheStudents,String[] branchNames,String[] collegeQuota,double[] feesAmount,Committees ANTI_RAGGING,FamousLecturers SANTHOSH)
	{
		this.name=name;
		this.principalName=principalName;
		this.totalStudents=totalStudents;
		this.hostelFacility=hostelFacility;
		this.phoneNumber=phoneNumber;
		this.totalBrancheStudents=totalBrancheStudents;
		this.branchNames=branchNames;
		this.collegeQuota=collegeQuota;
		this.feesAmount=feesAmount;
		this.ANTI_RAGGING=ANTI_RAGGING;
		this.SANTHOSH=SANTHOSH;
	
	}

	public void show()
	{
		System.out.println(this.name);
		System.out.println(this.principalName);
		System.out.println(this.totalStudents);
		System.out.println(this.hostelFacility);
		System.out.println(this.phoneNumber);
		System.out.println(this.ANTI_RAGGING);
		System.out.println(this.SANTHOSH);
		
		for (int i = 0; i < totalBrancheStudents.length; i++) {
			int quantity = totalBrancheStudents[i];
		System.out.println("totalBrancheStudents:"+ quantity);
	}
		for (int i = 0; i < branchNames.length; i++) {
			String  money = branchNames[i];
		System.out.println("branchNames:"+ money);
	}
		for (int i = 0; i < collegeQuota.length; i++) {
			String string = collegeQuota[i];
		System.out.println("collegeQuota:"+ string);
	}
		for (int i = 0; i < feesAmount.length; i++) {
			double string = feesAmount[i];
		System.out.println("feesAmount:"+ string);
	}
	}
	
}

