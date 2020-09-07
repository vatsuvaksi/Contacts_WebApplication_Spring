package vatsuvaksi.domainClasses;

public class user {
	
	public user() {
		
	}
	private String name; // stores user name 
	private String phone; // stores user's phone number 
	private String email; // stores user's email 
	private String address ; // strores user's address
	private String LoginName; // This stores the Login name through which user can Interact 
	private String password ; // this stores the password 
	private Integer role; // this stores the role wether he is admin or not. 
	private Integer LoginStatus; // this is the login status of the this user at this present time 
	private Integer userID;
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLoginName() {
		return LoginName;
	}
	public void setLoginName(String loginName) {
		LoginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	public Integer getLoginStatus() {
		return LoginStatus;
	}
	public void setLoginStatus(Integer loginStatus) {
		LoginStatus = loginStatus;
	}
	

}
