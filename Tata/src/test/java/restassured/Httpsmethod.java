package restassured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Httpsmethod {
	
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
		 
	
