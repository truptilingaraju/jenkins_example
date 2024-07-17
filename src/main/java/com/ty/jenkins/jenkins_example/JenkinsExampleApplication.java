package com.ty.jenkins.jenkins_example;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class JenkinsExampleApplication {

	public static final Logger logger= LoggerFactory.getLogger(JenkinsExampleApplication.class);
	public static void main(String[] args) {
		logger.info("continuos integration")
		SpringApplication.run(JenkinsExampleApplication.class, args);
	}

}
