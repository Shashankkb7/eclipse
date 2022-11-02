package com.xworkz.boot;

import com.xworkz.things.Perfume;
import com.xworkz.things.PerfumeModify;

public class PerfumeRunner {

	public static void main(String[] args) {

		Perfume perfume = new Perfume();
		System.out.println(perfume.getBrand());
		PerfumeModify modify = new PerfumeModify();
		modify.usePerfume(perfume);

	}

}
