package vatsuvaksi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import vatsuvaksi.dao.BaseDAO;
import vatsuvaksi.dao.UserDAO;
import vatsuvaksi.domainClasses.user;
import vatsuvaksi.exceptions.userBlockedExceptions;

@Service
//@ComponentScan(basePackages = "vatsuvaksi.dao,vatsuvaksi.service")
public class userServiceImplementation extends BaseDAO implements userService {

	@Autowired
	private UserDAO userDao;
	
	@Bean
	public void register(user u) {
		userDao.save(u);

	}

	public user login(String Loginname, String password) throws userBlockedExceptions {
		// TODO Auto-generated method stub
		return null;
	}

	public List<user> getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	public void changeStatus(Integer userID, Integer LoginStatus) {
		// TODO Auto-generated method stub

	}

}
