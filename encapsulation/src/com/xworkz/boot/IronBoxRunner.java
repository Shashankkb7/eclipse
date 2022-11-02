package com.xworkz.boot;

import com.xworkz.things.IronBox;
import com.xworkz.things.IronBoxModify;

public class IronBoxRunner {

	public static void main(String[] args) {

		IronBox iron = new IronBox();
		System.out.println(iron.getBrand());
		System.out.println(iron.getType());
		IronBoxModify modify = new IronBoxModify();
		modify.useIronBox(iron);

	}

}
