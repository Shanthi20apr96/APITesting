package user;

public class User {
	private String name;
	private String job;
// using constructor
public User(String name, String job) {
	 this.name = name;
	 this.job = job;
	 
}
public User(String job) {
	this.job =job;
}

/*using setter method
public void setName(String name) {
	this.name = name;
}
public void setJob(String job) {
	this.job = job;
} */
public String getName() {
	return name;
}
public String getJob() {
	return job;
}

}
