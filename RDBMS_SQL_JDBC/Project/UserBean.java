public class UserBean {
	private String ID;
	private String Password;
	private String Name;
	private int IncorrectAttempts;
	private int LockStatus;
	private String UserType;
	
	UserBean(){
		
	}
	UserBean(String ID, String Password, String Name, int IncorrectAttempts, int LockStatus, String UserType){
		this.ID = ID;
		this.Password = Password;
		this.Name=Name;
		this.IncorrectAttempts = IncorrectAttempts;
		this.LockStatus = LockStatus;
		this.UserType = UserType;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getIncorrectAttempts() {
		return IncorrectAttempts;
	}
	public void setIncorrectAttempts(int incorrectAttempts) {
		IncorrectAttempts = incorrectAttempts;
	}
	public int getLockStatus() {
		return LockStatus;
	}
	public void setLockStatus(int lockStatus) {
		LockStatus = lockStatus;
	}
	public String getUserType() {
		return UserType;
	}
	public void setUserType(String userType) {
		UserType = userType;
	}
}
