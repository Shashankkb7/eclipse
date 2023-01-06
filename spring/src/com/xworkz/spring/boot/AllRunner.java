package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.thing.Area;
import com.xworkz.spring.thing.Bus;
import com.xworkz.spring.thing.Chocolate;
import com.xworkz.spring.thing.City;
import com.xworkz.spring.thing.Cycle;
import com.xworkz.spring.thing.Fish;
import com.xworkz.spring.thing.Girl;
import com.xworkz.spring.thing.God;
import com.xworkz.spring.thing.Mall;
import com.xworkz.spring.thing.Mask;
import com.xworkz.spring.thing.Milk;
import com.xworkz.spring.thing.Park;
import com.xworkz.spring.thing.Patient;
import com.xworkz.spring.thing.Road;
import com.xworkz.spring.thing.Temple;

public class AllRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		Area ref1 = spring.getBean(Area.class);
		System.out.println(ref1);
		Bus ref2 = spring.getBean(Bus.class);
		System.out.println(ref2);
		Chocolate ref3 = spring.getBean(Chocolate.class);
		System.out.println(ref3);
		City ref4 = spring.getBean(City.class);
		System.out.println(ref4);
		Cycle ref5 = spring.getBean(Cycle.class);
		System.out.println(ref5);
		Fish ref6 = spring.getBean(Fish.class);
		System.out.println(ref6);
		Girl ref7 = spring.getBean(Girl.class);
		System.out.println(ref7);
		God ref8 = spring.getBean(God.class);
		System.out.println(ref8);
		Mall ref9 = spring.getBean(Mall.class);
		System.out.println(ref9);
		Mask ref10 = spring.getBean(Mask.class);
		System.out.println(ref10);
		Milk ref11 = spring.getBean(Milk.class);
		System.out.println(ref11);
		Park ref12 = spring.getBean(Park.class);
		System.out.println(ref12);
		Patient ref13 = spring.getBean(Patient.class);
		System.out.println(ref13);
		Road ref14 = spring.getBean(Road.class);
		System.out.println(ref14);
		Temple ref15 = spring.getBean(Temple.class);
		System.out.println(ref15);
	}

}
