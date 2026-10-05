package apitests;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import user.StudentsAPI;

import static io.restassured.RestAssured.*; 
import static org.hamcrest.Matchers.*;
public class Deserialization {

	@Test
	public void getData() {
		Response response = 
				given()
				.baseUri("http://localhost:3000/students/")
				.when()
				.get("q9ctwsSBkbE");
			StudentsAPI student = response.as(StudentsAPI.class);
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getLocation());
			System.out.println(student.getCourses());
			System.out.println(student.getNumber());
				
	}
	
}
