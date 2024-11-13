package com.darshan.jobListing;

import com.darshan.jobListing.bean.container.Student;
import com.darshan.jobListing.model.Post;
import com.darshan.jobListing.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JobListingApplication {

// Setting the logger
	private static final Logger logger = LoggerFactory.getLogger(JobListingApplication.class);

//http://localhost:8082/swagger-ui/index.html#/post-controller/getAllPosts
//configuring the open API in the application
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("API Documentation")
						.version("1.0")
						.description("API documentation for the application")
						.license(new License().name("Apache 2.0").url("http://springdoc.org")))
				.externalDocs(new ExternalDocumentation()
						.description("SpringDoc Wiki Documentation")
						.url("https://springdoc.org/v2/"));
	}

	@Bean
	public GroupedOpenApi publicApi() {
		return GroupedOpenApi.builder()
				.group("public")
				.pathsToMatch("/**")
				.build();
	}
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}


	public static void main(String[] args) {

//		SpringApplication.run(JobListingApplication.class, args);
		logger.info("Hello World");

/*Here we are extracting a bean class to check the basic working of @SpringBootConfiguration class
*  Here the run method will store have application context which stores the beans that can be extracted and used
 */
		ConfigurableApplicationContext context = SpringApplication.run(JobListingApplication.class,args);
		Student bean = context.getBean(Student.class);




		logger.info("The bean from application context : "+ bean);



	}


}
