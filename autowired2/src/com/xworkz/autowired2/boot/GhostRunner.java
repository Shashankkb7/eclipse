package com.xworkz.autowired2.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowired2.bean.Ghost;
import com.xworkz.autowired2.configuration.GhostConfiguration;

public class GhostRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(GhostConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		Ghost refOfGhost = container.getBean(Ghost.class);
		System.out.println(refOfGhost);
	}

}
