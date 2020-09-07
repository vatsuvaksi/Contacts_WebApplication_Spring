package vatsuvaksi.services;

import java.util.List;

import vatsuvaksi.domainClasses.user;
import vatsuvaksi.exceptions.userBlockedExceptions;

public interface userService {
	final public static int  LoginStatusActive=1; // This indicated that the login status is final and in smplemented in only one function if it has to be changed by the admin
	final public static int LoginStatusBlocked=2; // This indicated that the login status in inactive and final but can be changed by the admin and returned the last method of this userService Interface 
	public void registerUser(user u); // This will register for a new user 
	public user userLogin(String LoginName, String password) throws userBlockedExceptions; //This method is used for login and it will return null if it fails otherwise will return the user 
	public List<user> getUserList();
	public void changeLoginStatus(Integer userID,Integer LoginStatus);

}
