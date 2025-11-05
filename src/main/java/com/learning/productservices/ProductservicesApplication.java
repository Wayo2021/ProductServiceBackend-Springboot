package com.learning.productservices;

import com.learning.productservices.model.enums.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ProductservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductservicesApplication.class, args);
	}

	@Autowired
	public void setPrintLog(Environment environment) {
		System.out.println("======================= APP ==========================");
		System.out.println("\tApp name\t: " + environment.getProperty(Log.APP_NAME.getValue()) );
		System.out.println("\tApp purpose\t: " + environment.getProperty(Log.APP_PURPOSE.getValue()) );
		System.out.println("\tApp frontend port\t: " + environment.getProperty(Log.APP_FE_PORT.getValue()) );
		System.out.println("\tApp backend port\t: " + environment.getProperty(Log.APP_BE_PORT.getValue()) );
		System.out.println("\tApp db name\t: " + environment.getProperty(Log.APP_DB_NAME.getValue()) );
		System.out.println("======================================================");
	}

}
