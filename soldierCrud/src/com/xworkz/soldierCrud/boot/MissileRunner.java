package com.xworkz.soldierCrud.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldierCrud.configuration.SpringConfiguration;
import com.xworkz.soldierCrud.dto.MissileDTO;
import com.xworkz.soldierCrud.service.MissileService;

public class MissileRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		MissileService service = container.getBean(MissileService.class);
		boolean saved = service.validateAndSave(new MissileDTO());
		System.out.println("saved " + saved);

	}

}
