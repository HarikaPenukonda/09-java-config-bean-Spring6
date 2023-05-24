package com.luv2code.springcoredemo.config;

import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Spring Configuration annotation indicates that the class has @Bean definition methods.
// So Spring container can process the class and generate Spring Beans to be used in the application.
public class SportConfig {

    // Define @Bean method to configure the bean
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(); // returns instance of SwimCoach, The bean id defaults to the method name
    }
}
