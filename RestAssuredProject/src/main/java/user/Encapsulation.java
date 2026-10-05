package user;

public class Encapsulation {

		
		private String name;
		private String location;
		private String number;
		private String id;
		
		public void setName(String name) {
			this.name = name;
				}
		public void setLocation(String location) {
			this.location = location;
		}
		public void setNumber(String number) {
			this.number = number;
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
		
	}

