package com.xworkz.soldierCrud.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldierCrud.configuration.SpringConfiguration;
import com.xworkz.soldierCrud.dto.FirstAidDTO;
import com.xworkz.soldierCrud.service.FirstAidService;

public class FirstAidRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		FirstAidService service = container.getBean(FirstAidService.class);
		boolean saved = service.validateAndSave(new FirstAidDTO());
		System.out.println("saved " + saved);
	}

}
