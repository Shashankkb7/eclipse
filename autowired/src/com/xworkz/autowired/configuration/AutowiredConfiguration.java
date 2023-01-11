package com.xworkz.autowired.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.autowired")
public class AutowiredConfiguration {

	public AutowiredConfiguration() {
		System.out.println("Created AutowiredConfiguration");
	}

	@Bean
	public String softwareName() {
		System.out.println("Registering softwareName");
		String string = new String("Eclipse");
		return string;
	}

	@Bean
	public double softwareVersion() {
		System.out.println("Registering softwareVersion");
		double value = 10.2;
		return value;
	}

	@Bean
	public String softwareDevelopedBy() {
		System.out.println("Registering softwareDevelopedBy");
		return "Virat Kohli";
	}

	@Bean
	public LocalDate date() {
		System.out.println("Registering date");
		return LocalDate.of(1989, 01, 24);
	}

	@Bean
	public boolean softwareIsFree() {
		System.out.println("Registering softwareIsFree");
		return true;
	}

	@Bean
	public String softwareEngineerName() {
		System.out.println("Registering softwareEngineerName");
		return "Suryakumar Yadav";
	}

	@Bean
	public double softwareEngineerSalary() {
		System.out.println("Registering softwareEngineerSalary");
		return 450000;
	}

	@Bean
	public String softwareEngineerCompanyName() {
		System.out.println("Registering softwareEngineerCompanyName");
		return "Google";
	}

	@Bean
	public int softwareEngineerExp() {
		System.out.println("Registering softwareEngineerExp");
		return 10;
	}

	@Bean
	public int hardwareShopId() {
		System.out.println("Registering hardwareShopId");
		return 974123456;
	}

	@Bean
	public String hardwareShopName() {
		System.out.println("Registering hardwareShopName");
		return "Namma Bengaluru Hardware shop";
	}

	@Bean
	public long hardwareShopGstNo() {
		System.out.println("Registering hardwareShopGstNo");
		return 75314862545L;
	}

	@Bean
	public String hardwareShopOwnerName() {
		System.out.println("Registering hardwareShopOwnerName");
		return "Govindraju";
	}

	@Bean
	public String hardwareShopAddress() {
		System.out.println("Registering hardwareShopAddress");
		return "Bangalore";
	}

	@Bean
	public String pencilName() {
		System.out.println("Registering pencilName");
		return "Apsara";
	}

	@Bean
	public String pencilType() {
		System.out.println("Registering pencilType");
		return "Charcoal";
	}

	@Bean
	public double pencilPrice() {
		System.out.println("Registering pencilPrice");
		return 10;
	}

	@Bean
	public String pencilColor() {
		System.out.println("Registering pencilColor");
		return "Grey";
	}

	@Bean
	public boolean pencilIsSharp() {
		System.out.println("Registering pencilIsSharp");
		return true;
	}

	@Bean
	public boolean pencilIsStolen() {
		System.out.println("Registering pencilIsStolen");
		return false;
	}

	@Bean
	public String rubberName() {
		System.out.println("Registering rubberName");
		return "Nataraja";
	}

	@Bean
	public String rubberType() {
		System.out.println("Registering rubberType");
		return "Silicone";
	}

	@Bean
	public double rubberPrice() {
		System.out.println("Registering rubberPrice");
		return 5.5;
	}

	@Bean
	public String rubberColor() {
		System.out.println("Registering rubberColor");
		return "White";
	}

	@Bean
	public boolean rubberIsSharp() {
		System.out.println("Registering rubberIsSharp");
		return false;
	}

	@Bean
	public boolean rubberIsStolen() {
		System.out.println("Registering rubberIsStolen");
		return true;
	}

	@Bean
	public double rubberSize() {
		System.out.println("Registering rubberSize");
		return 12;
	}

	@Bean
	public String personName() {
		System.out.println("Registering personName");
		return "Ab de Villiers";
	}

	@Bean
	public int personShoeSize() {
		System.out.println("Registering personShoeSize");
		return 8;
	}
	
	@Bean
	public byte personPantSize() {
		System.out.println("Registering personPantSize");
		return 30;
	}

	@Bean
	public short personShirtSize() {
		System.out.println("Registering personShirtSize");
		return 38;
	}

	@Bean
	public long personPhNo() {
		System.out.println("Registering personPhNo");
		return 9876543210l;
	}

	@Bean
	public float personHeight() {
		System.out.println("Registering personHeight");
		return 5.8f;
	}

	@Bean
	public double personWeight() {
		System.out.println("Registering personWeight");
		return 80.50;
	}

	@Bean
	public char personGender() {
		System.out.println("Registering personGender");
		return 'M';
	}

	@Bean
	public boolean personIsAlive() {
		System.out.println("Registering personIsAlive");
		return true;
	}
}
