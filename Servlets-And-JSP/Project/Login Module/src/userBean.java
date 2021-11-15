package bean;

public class userBean {
	private String username, password, newpass;
	userBean(){
		
	}
	public userBean(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public userBean(String username, String password,String newpass) {
		this.username = username;
		this.password = password;
		this.newpass = newpass;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNewPass() {
		return newpass;
	}
	public void setNewPass(String newpass) {
		this.newpass = newpass;
	}
	
}
