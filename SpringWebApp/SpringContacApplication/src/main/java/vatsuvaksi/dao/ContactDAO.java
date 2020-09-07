package vatsuvaksi.dao;

import java.util.List;

import vatsuvaksi.domainClasses.contact;

public interface ContactDAO {      //This Interface is used to implement in contactDAOimplementation it do all the functions provided below 
	public void save(contact c);
	public void update(contact c);
	public void delete(contact c);
	public void deleteById(Integer contactId);
	public contact findById(Integer ContactId);
	public List<contact> findAll();
	public List<contact> findByProperty(String propName, Object propValue);
}
