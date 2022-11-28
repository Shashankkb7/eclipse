package com.xworkz.rules.Runner;

import com.xworkz.rules.Pg;
import com.xworkz.rules.bridge.PgFollowers;

public class PgRunner {

	public static void main(String[] args) {

		Pg pg = new PgFollowers();
		pg.boys();
		pg.location();
		pg.noOfStudents();
		pg.warden();
		pg.wearMask();
	}

}
