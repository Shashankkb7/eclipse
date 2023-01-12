package com.xworkz.autowired2.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowired2.bean.Engine;
import com.xworkz.autowired2.configuration.EngineConfiguration;

public class EngineRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(EngineConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		Engine refOfEngine = container.getBean(Engine.class);
		System.out.println(refOfEngine);
	}

}
