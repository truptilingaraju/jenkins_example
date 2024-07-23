package com.ty.jenkins.jenkins_example.controller;

import com.ty.jenkins.jenkins_example.JenkinsExampleApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JenkinsExampleApplication.class);
	}

}
