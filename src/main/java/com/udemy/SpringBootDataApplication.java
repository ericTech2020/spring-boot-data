package com.udemy;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringBootDataApplication implements CommandLineRunner {



	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringBootDataApplication.class, args);

		/*for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}*/
	}

	@Override
	public void run(String... args) throws Exception {
		//write something before application start
		System.out.println("start");
	}
}
