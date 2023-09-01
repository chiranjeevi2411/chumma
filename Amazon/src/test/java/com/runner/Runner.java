package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.base.Baseamazo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features= "C:\\Users\\DURAI\\eclipse-workspace\\Amazon\\src\\main\\java\\com\\Feature\\Lime.feature",
                  glue = "com.step")

public class Runner extends Baseamazo {
	
	@BeforeClass
	public static void setup() {
		
		browserLaunch("chrome");
		LaunchUrl("https://www.amazon.in/");
		
		
	}

}
