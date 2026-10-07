package apitests;
import org.testng.annotations.Test;

import user.StudentsAPI;

import static io.restassured.RestAssured.*; 
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.List;

public class Student {

	@Test
	public void studentDetails() {
		
	//StudentsAPI stu = new StudentsAPI("Andrews", "india", "12345", List.of("API", "Selenium"));
	StudentsAPI stu = new StudentsAPI();
	stu.setName("Shanthi");
	stu.setLocation("India");
	stu.setNumber("1234567890");
	stu.setCourses(List.of("Java", "Selenium"));
	
	
	given()
	.headers("Content-Type", "application/json")
	.body(stu)
	.when()
	//.get("http://localhost:3000/books")
	.post("http://localhost:3000/students")
	.then()
	.log().body()
	.statusCode(201)
	//validating array
	.body("courses", hasItem("Selenium"))
	.body("courses", hasItems("Selenium","Java"))
	.headers("Content-Type",containsString("application/json"))
	//.headers("Content-Type",equalTo("application/json; charset=utf-8"));
	.time(lessThan(3000l))
	//check the size
	.body("courses",hasSize(2))
	//.cookie("sessionId",notNullValue())
	//.cookie("sessionId",equalTo("123"));
	.body("courses",equalTo(Arrays.asList("Java", "Selenium")));
	
	
}
}
