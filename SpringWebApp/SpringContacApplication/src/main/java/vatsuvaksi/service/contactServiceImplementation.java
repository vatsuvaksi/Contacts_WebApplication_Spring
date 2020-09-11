package vatsuvaksi.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vatsuvaksi.dao.BaseDAO;
import vatsuvaksi.dao.ContactDAO;
import vatsuvaksi.domainClasses.contact;
import vatsuvaksi.rowMapper.contactRowMapper;

@Service
public class contactServiceImplementation extends BaseDAO implements contactService {

	@Autowired
	private ContactDAO contactDao;
	public void save(contact c) {
		// TODO Auto-generated method stub
		contactDao.save(c);
	}

	public void update(contact c) {
		// TODO Auto-generated method stub
		contactDao.update(c);
		
	}

	public void delete(Integer contactId) {
		// TODO Auto-generated method stub
		contactDao.deleteById(contactId);
		
	}

	public void delete(Integer[] contactIds) {
		// TODO Auto-generated method stub
		String id = null;
		
		for(Integer a:contactIds)
		{
			id=String.valueOf(a) + ",";
		}
		id=id.substring(0, id.length()-1);
		
		String sqlQuery="DELETE FROM contact WHERE contactId IN(" + id + ")";
		getJdbcTemplate().update(sqlQuery);
		
	}

	public List<contact> findUserContact(Integer userId) {
		
		return contactDao.findByProperty("userID", userId);
	}

	public List<contact> findUserContact(Integer userId, String txt) {
		String sql="SELECT * FROM contact where idUser=? AND name LIKE '%"+ txt +"%"+  "OR email LIKE '%"+ txt +"%'" + "OR phone LIKE '%"+ txt +"%'" + "OR address LIKE '%"+ txt +"%";
	   return getJdbcTemplate().query(sql, new contactRowMapper(),userId);
	}

}
