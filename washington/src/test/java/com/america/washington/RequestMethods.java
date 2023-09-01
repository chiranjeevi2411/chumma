package com.america.washington;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RequestMethods {

	String bearer_token = "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";

	@Test
	public void getRep() {

		RestAssured.baseURI = "https://api.github.com";

		Response response = RestAssured.given().headers("Authorization", "Bearer " + bearer_token).when()
				.get("/repos/chiranjeevi2411/Anakai").then().log().all().extract().response();

		Assert.assertEquals(response.getStatusCode(), 200);

		System.out.println("status code :" + response.getStatusCode());
	}

	@Test
	public void deleteRepo() {
		RestAssured.baseURI = "https://api.github.com";

		Response response = RestAssured.given().headers("Authorization", "Bearer " + bearer_token).when()
				.delete("/repos/chiranjeevi2411/kar").then().log().all().extract().response();

		Assert.assertEquals(response.getStatusCode(), 204);

		System.out.println("status code :" + response.getStatusCode());
}
	@Test
    public void updateTopics() {
		
    	RestAssured.baseURI = "https://api.github.com";

		Response response = RestAssured.given().headers("Authorization", "Bearer " + bearer_token)
				.body("{\r\n"
						+ "\"names\" : [ \"java\",\"selenium\",\"api\"]\r\n"
						+ "}")
				.when()
				.put("/repos/chiranjeevi2411/test123/topics").then().log().all().extract().response();

		Assert.assertEquals(response.getStatusCode(), 200);

		System.out.println("status code :" + response.getStatusCode());

	}
	   @Test
	   public void createRepo() {
		   
		   RestAssured.baseURI = "https://api.github.com";

			Response response = RestAssured.given().headers("Authorization", "Bearer " + bearer_token)
					.body("{\r\n"
							+ "\"name\":\"Repo_IPT\",\r\n"
							+"\"private\": true\r\n"
							+ "}")
					.when().post("/user/repos")
					.then().log().all().extract().response();
			Assert.assertEquals(response.getStatusCode(), 422);

			System.out.println("status code :" + response.getStatusCode());
		   
		   
		   
		   
		   
		   
	   }
	
}
