package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features ="C:\\Users\\DURAI\\eclipse-workspace\\Lime_Road\\src\\test\\java\\com\\Feature\\Lime.feature",
                            glue = "com.step" )


public class Runner_Class {

}
