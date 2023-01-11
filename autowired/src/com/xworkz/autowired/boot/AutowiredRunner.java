package com.xworkz.autowired.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowired.bean.HardwareShop;
import com.xworkz.autowired.bean.Pencil;
import com.xworkz.autowired.bean.Person;
import com.xworkz.autowired.bean.Rubber;
import com.xworkz.autowired.bean.Software;
import com.xworkz.autowired.bean.SoftwareEngineer;
import com.xworkz.autowired.configuration.AutowiredConfiguration;

public class AutowiredRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(AutowiredConfiguration.class);
		String[] bean = container.getBeanDefinitionNames();
		System.out.println(bean);

		Software refOfSoftware = container.getBean(Software.class);
		System.out.println(refOfSoftware);

		SoftwareEngineer refOfSoftwareEngineer = container.getBean(SoftwareEngineer.class);
		System.out.println(refOfSoftwareEngineer);

		HardwareShop refOfHardwareShop = container.getBean(HardwareShop.class);
		System.out.println(refOfHardwareShop);

		Pencil refOfPencil = container.getBean(Pencil.class);
		System.out.println(refOfPencil);

		Rubber refOfRubber = container.getBean(Rubber.class);
		System.out.println(refOfRubber);

		Person refOfPerson = container.getBean(Person.class);
		System.out.println(refOfPerson);
	}

}
