package com.xworkz.other;

import com.xworkz.boot.DistrictCollector;

public class DistrictCollectorRunner {

	public static void main(String[] args) {
		
		DistrictCollector collector=new DistrictCollector();
		collector.name="Kavitha S Maniikeri";
		collector.age=40;
		collector.district="Chitradurga";
		collector.batchNumber=2019;
		System.out.println(collector.name);
		System.out.println(collector.age);
		System.err.println(collector.district);
		System.out.println(collector.batchNumber);
		
	}

}
