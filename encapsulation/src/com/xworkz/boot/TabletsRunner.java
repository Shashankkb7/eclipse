package com.xworkz.boot;

import com.xworkz.things.Tablets;
import com.xworkz.things.TabletsModify;

public class TabletsRunner {

	public static void main(String[] args) {
		

		Tablets tablets = new Tablets();
		System.out.println(tablets.getName());
		System.out.println(tablets.getPrice());
		TabletsModify modify = new TabletsModify();
		modify.useTablets(tablets);

	}


}
