package vatsuvaksi.service;

import java.util.List;

import vatsuvaksi.domainClasses.contact;

public interface contactService {
	public void save(contact c);
	public void update(contact c);
	public void delete(Integer contactId);
	public void delete(Integer[] contactIds);
	public List<contact> findUserContact(Integer userId);
	public List<contact> findUserContact(Integer userId, String txt);

}
