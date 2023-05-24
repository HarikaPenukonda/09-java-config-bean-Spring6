package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for dependency
    private Coach myCoach;


    // default scope is singleton, All dependency injections for the bean will reference the SAME bean (cricketCoach)
    // Tell Spring to inject a dependency, optional if only one constructor
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach myCoach) {
        System.out.println("In Constructor: " + getClass().getSimpleName());
        this.myCoach = myCoach;
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
