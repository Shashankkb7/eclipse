package com.xworkz.other;

import com.xworkz.boot.Developer;

public class DeveloperRunner {

	public static void main(String[] args) {

		Developer code=new Developer();
		code.name="xyz";
		code.education="B.E";
		code.experience="8 years";
		code.salary=350000;
		code.company="Wipro";
		
		System.out.println(code.name);
		System.out.println(code.education);
		System.out.println(code.experience);
		System.out.println(code.salary);
		System.out.println(code.company);

	}

}
