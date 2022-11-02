package com.xworkz.things;

public class IronBoxModify {

	public void useIronBox(IronBox ironBox) {
		System.out.println("accessing ironBox brand:" + ironBox.getBrand());
		ironBox.setBrand("Philips");
		System.out.println("accessing ironBox type:" + ironBox.getType());
		ironBox.setType("Steel");
		System.out.println("accessing modfying ironBox brand:" + ironBox.getBrand());
		System.out.println("accessing modfying ironBox type:" + ironBox.getType());
		System.out.println("ironBox color:" + ironBox.color);
		System.out.println("ironBox height:" + ironBox.height);
		System.out.println("ironBox water Tank Capacity:" + ironBox.waterTankCapacity);
		System.out.println("ironBox weight:" + ironBox.weight);
		System.out.println("ironBox automatic ShutOff:" + ironBox.automaticShutOff);
		System.out.println("ironBox indicator Light:" + ironBox.indicatorLight);
		System.out.println("ironBox self Cleaning:" + ironBox.selfCleaning);
		System.out.println("ironBox steam burst:" + ironBox.steamBurst);
		System.out.println("ironBox temperature Control:" + ironBox.temperatureControl);
	}
}
