
public class User {
	private String userID;
	private String forename;
	private String surname;
	
	public User(String userID, String forename, String surname) {
		this.userID = userID;
		this.forename = forename;
		this.surname = surname;l
	}
	
	public String getuserID() {
		return userID;
	}
	
	public void setuserID(String userID) {
		this.userID = userID;
	}
	
	public String getForename() {
		return forename;
	}
	
	public void setForename(String forename) {
		this.forename = forename;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}