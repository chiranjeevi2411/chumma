package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.base.Baseamazo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\DURAI\\eclipse-workspace\\Amazon\\src\\main\\java\\com\\Feature\\Lime1.feature", glue = "com.step", monochrome = true, dryRun = false, strict = true, tags = "@smoke", plugin = {
		"pretty", "json:Resources/limeroad.json", "html:Res/lime.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

}

)

public class Limerunner extends Baseamazo {
	@BeforeClass
	public static void browser() {
		
		browserLaunch("Chrome");
		implicit();
		
	}
	@AfterClass
  public static void last() {
	title();

}
}
