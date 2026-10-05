package apitests;
import org.testng.annotations.Test; 
import user.User;
import static io.restassured.RestAssured.*; 
import static org.hamcrest.Matchers.*;
public class UserTest {
	
@Test(priority =1)
	public void createUser() {
	//use below code when values are set using constructor
	//User user = new User("John", "developer");
	// when value is set using setter method
	User user = new User("John","tester");
	/*user.setName("John");
	user.setJob("developer"); */
	given()
	.baseUri("https://reqres.in")
	.headers("Content-Type", "application/json")
	.body(user)
	.when()
	.post("api/users")
	.then()
	.log().body()
	.statusCode(201);
	
}
@Test(priority =2)
public void updateUser() {

User user = new User("John","tester");

given()
.baseUri("https://reqres.in")
.headers("Content-Type", "application/json")
.body(user)
.when()
//.post("api/users")
.put("api/users/2")
.then()
.log().body()
//to check if value exactly match
.body("name", equalTo("John"))
.body("job",equalTo("tester"))
//to check if there is a value or non-empty
.body("job",notNullValue())
.body("courses",hasItem("Java"))

.statusCode(200);

}

@Test(priority =3)
public void updateJob() {
	User user = new User("Manager");
	given()
	.baseUri("https://reqres.in")
	.headers("Content-Type", "application/json")
	.body(user)
	.when()
	.patch("api/users/2")
	.then()
	.log().body()
.statusCode(200);
}
}
