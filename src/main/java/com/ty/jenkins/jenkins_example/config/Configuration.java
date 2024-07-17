package com.ty.jenkins.jenkins_example.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;


@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public ModelMapper modelMapper(){
        var modelMapper= new ModelMapper();
        modelMapper.getConfiguration().setSkipNullEnabled(true);
        modelMapper.getConfiguration().setCollectionsMergeEnabled(false);
        return modelMapper;
    }
}
