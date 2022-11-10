package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Pg;

public class HomeRunner {

	public static void main(String[] args) {

		Pg pg = new Pg();
		pg.permanent();
		pg.temporary();
	}

}
