package model;

public class passwords {

	private String User;
	private String password;
	
	
	
	public passwords() {
		User = "carlos";
		password = "1234";
	}
	
	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		User = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
