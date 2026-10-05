package user;

public class PlaceholderAPI {

	private int userID;
	private String title;
	private String body;
	
	public PlaceholderAPI(int userID, String title, String body) {
		this.userID = userID;
		this.title = title;
		this.body = body;
		
	}
	public int getUserID() {
		return userID;
	}
	public String getTitle() {
		return title;
	}
	public String getBody() {
		return body;
	}
}
