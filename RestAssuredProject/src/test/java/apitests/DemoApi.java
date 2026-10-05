package apitests;
import org.testng.annotations.Test; 

import static io.restassured.RestAssured.*; 
import static org.hamcrest.Matchers.*;
public class DemoApi {
@Test
public void getRequest() {
	given()
	.when()
	.get("http://localhost:3000/books/tJ9m3E2-hJk")
	.then()
	.statusCode(200);
	
	
	
}
}
