package user;
import java.util.ArrayList;
import java.util.List;
public class StudentsAPI {
	
	private String name;
	private String location;
	private String number;
	private List<String> courses;
	private String id;
	
	/*public StudentsAPI(String name, String location,String number, List<String> courses) {
		this.name = name;
		this.location = location;
		this.number = number;
		this.courses = courses;	
		
	}*/
	public void setName(String name) {
		this.name = name;
			}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;		
	}
	  public void setId(String id) {
	        this.id = id;
	    }
	  public String getId() {
	        return id;
	    }
	
	public String getName() {
		return name;
	
	}
	public String getLocation() {
		return location;
	}
	
	public String getNumber() {
		return number;
	}
	public List<String> getCourses() {
		return courses;
	}
}
