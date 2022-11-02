package com.xworkz.things;

public class WatchModify {

	public void useWatch(Watch watch) {
		System.out.println("accessing Watch Brand:" + watch.getBrand());
		watch.setBrand("Realme");
		System.out.println("accessing Watch type:" + watch.getType());
		watch.setType("Analog");
		System.out.println("accessing modfying Watch Brand:" + watch.getBrand());
		System.out.println("accessing modfying Watch type:" + watch.getType());
		System.out.println("Watch waterResistant:" + watch.waterResistant);
		System.out.println("Watch compatibleToIos:" + watch.compatibleToIos);
		System.out.println("Watch callFunction:" + watch.callFunction);
		System.out.println("Watch strapMaterial:" + watch.strapMaterial);
		System.out.println("Watch modelNumber:" + watch.modelNumber);
		System.out.println("Watch idealFor:" + watch.idealFor);
		System.out.println("Watch dialShape:" + watch.dialShape);
		System.out.println("Watch color:" + watch.color);
		System.out.println("Watch batteryLife:" + watch.batteryLife);
	}
}
