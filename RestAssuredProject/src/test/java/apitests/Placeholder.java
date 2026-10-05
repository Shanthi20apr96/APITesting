package apitests;
import org.testng.annotations.Test;

import user.PlaceholderAPI;

import static io.restassured.RestAssured.*; 
import static org.hamcrest.Matchers.*;

public class Placeholder {

	@Test
	public void createNewData() {
		PlaceholderAPI placedemo = new PlaceholderAPI(3,"API Testing basics", "HTTPS methods");
		given()
		.baseUri("https://jsonplaceholder.typicode.com")
		.headers("Content-Type", "application/json")
		.body(placedemo)
		.when()
		.post("/posts")
		.then()
		.log().body()
		.statusCode(201);
	}
}
