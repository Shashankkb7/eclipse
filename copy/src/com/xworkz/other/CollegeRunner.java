package com.xworkz.other;

import com.xworkz.boot.College;
import com.xworkz.constants.Committees;
import com.xworkz.constants.FamousLecturers;


public class CollegeRunner {

	public static void main(String[] args) {
		
		int[] totalBrancheStudents= {180,200,350,450,550};
		String[] branchNames= {"Computer science","Civil","Mechanical","Electrical","Information science"};
		String[] collegeQuota= {"CET","Management","Comed-K"};
		double[] feesAmount= {400000.25,500052.25,450022.25,500522.75};
		
		College college=new College("KIT","Gurumurthy",2500,true,910812088,totalBrancheStudents,branchNames,collegeQuota,feesAmount,Committees.ANTI_RAGGING,FamousLecturers.SANTHOSH);
		college.show();
	}


}
