package vatsuvaksi.dao;

import java.util.List;

import vatsuvaksi.domainClasses.user;

public interface UserDAO {    // this is used to implement USERdaoIMPLEMENTATION so that it cann provide all the below things  
	public void save(user u);
	public void update(user u);
	public void delete(user u);
	public void deleteById(Integer userId);
	public user findById(Integer userId);
	public List<user> findAll();
	public List<user> findByProperty(String propName, Object propValue);
	

}
