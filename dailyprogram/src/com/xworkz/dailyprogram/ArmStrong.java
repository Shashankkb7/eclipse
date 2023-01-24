package com.xworkz.dailyprogram;

public class ArmStrong {

	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int result=0;
		
		while(num>0) {
			int last=num%10;
			result=result+(last*last*last);
			num=num/10;
		}
		if(temp==result) {
			System.out.println(temp+"is armstrong number");
		}else {
			System.out.println(temp+"is not armstrong number");
		}

	}


}
