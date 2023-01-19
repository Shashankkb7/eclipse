package com.xworkz.soldierCrud.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldierCrud.configuration.SpringConfiguration;
import com.xworkz.soldierCrud.dto.ResortDTO;
import com.xworkz.soldierCrud.service.ResortService;

public class ResortRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		ResortService service = container.getBean(ResortService.class);
		boolean saved = service.validateAndSave(new ResortDTO());
		System.out.println("saved " + saved);
	}

}
