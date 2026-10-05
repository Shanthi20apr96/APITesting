package apitests;
import org.testng.annotations.Test; 

import static io.restassured.RestAssured.*; 
import static org.hamcrest.Matchers.*;
public class GetRequestTest {
@Test
	public void getTodo() {
	given()
	.header("Content-Type","application/json")
	.when()
	.get("https://jsonplaceholder.typicode.com/posts/1")
		.then()
		//to see the response body
		//.log().body()
		.log().all()
		.statusCode(200);
}
@Test
public void deleteReq() {
	given()
	.when()
	.delete("https://jsonplaceholder.typicode.com/posts/1")
	.then()
	.statusCode(200);
}
}
