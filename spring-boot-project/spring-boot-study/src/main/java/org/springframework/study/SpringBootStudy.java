package org.springframework.study;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = SpringBootStudy.class)
public class SpringBootStudy {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringBootStudy.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.setAdditionalProfiles("default");
		System.out.println(application.run().getClassLoader());
	}
}
