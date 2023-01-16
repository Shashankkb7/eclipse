package com.xworkz.dependencyInjection.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.dependencyInjection.bean.Chrome;
import com.xworkz.dependencyInjection.bean.FireBox;
import com.xworkz.dependencyInjection.configuration.SpringConfiguration;
import com.xworkz.dependencyInjection.rules.Browser;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		Browser browser = container.getBean(Chrome.class);
		browser.browse();
		System.out.println(browser);
		Browser browser1 = container.getBean(FireBox.class);
		browser1.browse();
		System.out.println(browser1);

	}

}
