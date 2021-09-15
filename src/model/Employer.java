package model;

public class Employer {

	public String name;
	public String id;
	public String birthday;
	public String password;
	
	
	/**
	 * @param name
	 * @param id
	 * @param birthday
	 * @param password
	 */
	public Employer(String name, String id, String birthday, String password) {
		super();
		this.name = name;
		this.id = id;
		this.birthday = birthday;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
