package com.america.washington;

import static io.restassured.RestAssured.given;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Httpsmethods {

	   @Test 
       void getuser() {
		
    	given()
		 .when()
		 .get("https://github.com/chiranjeevi2411?tab=repositories")
		 .then()
		 .statusCode(200)
		 .log().all();
}
}