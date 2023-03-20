package com.xworkz.oven.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import lombok.extern.slf4j.Slf4j;

@Configuration
@ComponentScan("com.xworkz.oven")
@Slf4j
public class MicrowaveConfiguration {

	public MicrowaveConfiguration() {
		log.info("Created " + this.getClass().getSimpleName());
	}

	@Bean
	public MultipartResolver multipartResolver() {
		log.info("Registering multipartResolver");
		return new StandardServletMultipartResolver();
	}

	@Bean
	public ViewResolver viewResolver() {
		log.info("Registering ViewResolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		log.info("Registering LocalContainerEntityManagerFactoryBean");
		return new LocalContainerEntityManagerFactoryBean();
	}
}
