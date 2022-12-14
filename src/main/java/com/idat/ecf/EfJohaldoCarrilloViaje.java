package com.idat.ecf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class EfJohaldoCarrilloViaje {

	public static void main(String[] args) {
		SpringApplication.run(EfJohaldoCarrilloViaje.class, args);
	}

}
