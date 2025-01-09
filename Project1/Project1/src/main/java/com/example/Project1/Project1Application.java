package com.example.Project1;

import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {

//		SpringApplication.run(Project1Application.class, args);

		SpringApplication springApplication = new SpringApplication(TypeResolutionContext.Basic.class);
		springApplication.run(Project1Application.class, args);
//		springApplication.setBannerMode(Banner.Mode.OFF);


	}

}
