package com.xworkz.autowired2.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowired2.bean.NewsPaper;
import com.xworkz.autowired2.configuration.NewsPaperConfiguration;

public class NewsPaperRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(NewsPaperConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		NewsPaper refOfNewsPaper = container.getBean(NewsPaper.class);
		System.out.println(refOfNewsPaper);
	}

}
