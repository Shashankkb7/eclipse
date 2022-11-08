package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.PreWedding;
import com.xworkz.inheritance.things.PhotoShoot;

public class PhotoShootRunner {

	public static void main(String[] args) {

		PhotoShoot photo = new PreWedding("Radhika", "Yash", "Lalbagh");
		System.out.println("PhotoShoot details");
		System.out.println(photo.brideName);
		System.out.println(photo.groomName);
		System.out.println(photo.location);

	}

}
