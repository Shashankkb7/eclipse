package com.xworkz.boot;

import com.xworkz.things.Student;
import com.xworkz.things.StudentModify;

public class StudentRunner {

	public static void main(String[] args) {

		Student student = new Student();
		System.out.println(student.getName());
		StudentModify modify = new StudentModify();
		modify.useStudent(student);

	}

}
