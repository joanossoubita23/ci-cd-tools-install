package com.binary.carShow;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//
//@EnableAutoConfiguration
//@ComponentScan //this enables the spring boot component scan to find all the components in the application
//@Configuration // this annotation is used to define a configuration class that bean to Spring application
@SpringBootApplication
public class CarShowApplication {
	private  static final Logger logger= LoggerFactory.getLogger(CarShowApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(CarShowApplication.class, args);
		logger.info("Application start");
	}

}
