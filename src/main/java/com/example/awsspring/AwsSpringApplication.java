package com.example.awsspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class AwsSpringApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(AwsSpringApplication.class);
		application.addListeners(new ApplicationPidFileWriter());
		application.run(args);

	}

}
