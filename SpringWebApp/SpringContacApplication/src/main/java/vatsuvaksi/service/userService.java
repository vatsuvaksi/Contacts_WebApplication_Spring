package vatsuvaksi.service;

import java.util.List;

import vatsuvaksi.domainClasses.user;
import vatsuvaksi.exceptions.userBlockedExceptions;

public interface userService {
	public final static int LoginStatusActive=1;
	public final static int LoginStatusBlocked=2;
	public final static int RoleUser=2;
	public final static int RoleAdmin=1;
	public void register(user u);
	public user login(String Loginname,String password)throws userBlockedExceptions;
	public List<user> getUserList();
	public void changeStatus(Integer userID, Integer LoginStatus);
	
}
