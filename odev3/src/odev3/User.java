package odev3;

public class User {
	private String name;
	private String lastName;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getId() {
		return id = name.substring(0,2) + lastName.substring(0,2);
	}
	
	
	
}
