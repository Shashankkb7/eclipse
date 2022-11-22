package com.xworkz.equals.boot;

import com.xworkz.equals.things.Currency;
import com.xworkz.equals.things.God;
import com.xworkz.equals.things.Hospital;
import com.xworkz.equals.things.Institution;
import com.xworkz.equals.things.Lipstick;
import com.xworkz.equals.things.Paint;
import com.xworkz.equals.things.Vehicle;
import com.xworkz.equals.things.WaterBottle;

public class Runner {

	public static void main(String[] args) {

		Paint paint = new Paint();
		paint.setBrand("Asian paints");
		paint.setColor("clear");
		paint.setApplicationType("Interior");
		paint.setFeatures("Non toxic");
		paint.setFinish("Glossy");
		paint.setPrice(2993.0);
		paint.setModelNumber("HPCA22009");
		paint.setQuantity(4);
		paint.setType("Emulsion");
		paint.setWashable(true);
		System.out.println(paint);

		Paint paint2 = new Paint("Asian paints", 2990, "Royal emulsion", "Low odor", "Matte", false, 2, "White",
				"Exterior", "1ACB521");
		System.out.println(paint2);

		boolean same = paint.equals(paint2);
		System.out.println(same);
		System.out.println();

		Vehicle vehicle = new Vehicle();
		vehicle.setName("Himalayan");
		vehicle.setColor("grey");
		vehicle.setBrand("Royal enfield");
		vehicle.setNo("KA 16 ES 7438");
		vehicle.setPrice(273000);
		vehicle.setModel("BSVI");
		vehicle.setMileage(30);
		vehicle.setFuelTankCapacity(16);
		vehicle.setNoOfTyres(2);
		vehicle.setWeightInKg(200);
		System.out.println(vehicle);

		Vehicle vehicle2 = new Vehicle("Classic 350", "grey", "Royal enfield", "KA 18 ES 1234", 250000, "BSIV", 35, 15,
				3, 190);
		System.out.println(vehicle2);

		boolean same1 = vehicle.equals(vehicle2);
		System.out.println(same1);
		System.out.println();

		WaterBottle bottle = new WaterBottle();
		bottle.setBrand("Prestige");
		bottle.setColor("Silver");
		bottle.setPrice(250);
		bottle.setCapacity(2);
		bottle.setMaterial("Steel");
		bottle.setModel("Stainless");
		bottle.setGenericName("Bottle");
		bottle.setCountryOfOrigin("India");
		bottle.setQuality(true);
		bottle.setDesign(true);
		System.out.println(bottle);

		WaterBottle bottle2 = new WaterBottle("Prestige", "Silver", 40, 1, "Plastic", "Plastic", "Water bottle",
				"India", false, false);
		System.out.println(bottle2);

		boolean same2 = bottle.equals(bottle2);
		System.out.println(same2);
		System.out.println();

		Currency currency = new Currency();
		currency.setType("Paper");
		currency.setColor("Blue");
		currency.setAmount(100);
		currency.setFake(false);
		currency.setCountry("India");
		currency.setAcceptIn("All countries");
		currency.setDepth(0.1);
		currency.setOriginal(true);
		currency.setWidth(1.5);
		currency.setHeight(0.5);

		Currency currency2 = new Currency("Paper", "Blue", 200, false, "India", "All countries", 0.3, false, 1.7, 0.7);
		System.out.println(currency2);

		boolean same3 = currency.equals(currency2);
		System.out.println(same3);
		System.out.println();

		God god = new God();
		god.setName("Manjunatha");
		god.setGender("Male");
		god.setPriestName("Ramesh");
		god.setLocation("Dharmasthala");
		god.setTempleName("Sri manjunatha temple");
		god.setEntryFees(150);
		god.setPowerfull(true);
		god.setNoOfPriests(40);
		god.setNoOfVisitors(20000);
		god.setOpenMorning(true);

		God god2 = new God("Manjunatha", "Male", "Ramesh", "Dharmasthala", "Sri manjunatha temple", 200, true, 50,
				25000, true);
		System.out.println(god2);

		boolean same4 = god.equals(god2);
		System.out.println(same4);
		System.out.println();

		Institution institute = new Institution();
		institute.setSince(1951);
		institute.setPrincipalName("Gurumurthy");
		institute.setPincode(572201);
		institute.setPhNo(45678952L);
		institute.setOwner("Manjunath");
		institute.setName("KIT");
		institute.setLocation("Tiptur");
		institute.setInstituteDistrict("Tumkur");
		institute.setFees(100000);
		institute.setChairman("Sudhakar");

		Institution institute2 = new Institution("KIT", "Manjunath", "Tiptur", "Gurumurthy", "Tumkur", "Sudhakar", 1952,
				110000, 789632145L, 572201);
		System.out.println(institute2);

		boolean same5 = institute.equals(institute2);
		System.out.println(same5);
		System.out.println();

		Hospital hospital = new Hospital();
		hospital.setType("Primary health center");
		hospital.setPincode(577515);
		hospital.setPhNo(2750212L);
		hospital.setNoOfNurses(5);
		hospital.setName("Clinic");
		hospital.setLocation("Sanehalli");
		hospital.setHospitalTaluk("Hosadurga");
		hospital.setHospitalDistrict("Chitradurga");
		hospital.setDoctorName("Rahul");
		hospital.setDoctorGender("Male");
		System.out.println(hospital);

		Hospital hospital2 = new Hospital("Clinic", "Sanehalli", "Rahul", "Male", "Primary health center", "Hosadurga",
				"Chitradurga", 512012, 45123478L, 4);
		System.out.println(hospital2);

		boolean same6 = hospital.equals(hospital2);
		System.out.println(same6);
		System.out.println();

		Lipstick lipstick = new Lipstick();
		lipstick.setTexture("Liquid");
		lipstick.setQuantity("4.5 ml");
		lipstick.setPrice(669);
		lipstick.setName("Nykaa");
		lipstick.setGenericName("lipsticks");
		lipstick.setForm("water");
		lipstick.setFinish("Matte");
		lipstick.setDuration(5);
		lipstick.setCountryOrigin("India");
		lipstick.setColor("Pink");
		System.out.println(lipstick);

		Lipstick lipstick2 = new Lipstick("Nykaa", "Liquid", "water", "Matte", "Pink", "India", "lipsticks", "4.5 ml",
				690, 6);
		System.out.println(lipstick2);

		boolean same7 = lipstick.equals(lipstick2);
		System.out.println(same7);
	}

}
