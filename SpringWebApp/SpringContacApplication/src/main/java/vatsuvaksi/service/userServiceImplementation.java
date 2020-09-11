package vatsuvaksi.service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import vatsuvaksi.dao.BaseDAO;
import vatsuvaksi.dao.UserDAO;
import vatsuvaksi.domainClasses.user;
import vatsuvaksi.exceptions.userBlockedExceptions;
import vatsuvaksi.rowMapper.userRowMapper;

@Service
public class userServiceImplementation extends BaseDAO implements userService {

	@Autowired
	private UserDAO userDao;
	
	
	public void register(user u) {
		userDao.save(u);

	}

	public user login(String Loginname, String password) throws userBlockedExceptions {
		String sql="SELECT * FROM user WHERE LoginName=:Loginname AND password=:password";
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("Loginname",Loginname);
		map.put("password", password);
        try {
            user u = getNamedParameterJdbcTemplate().queryForObject(sql, map, new userRowMapper());
            if (u.getLoginStatus().equals(userService.LoginStatusBlocked)) {
                throw new userBlockedExceptions("Your accout has been blocked. Contact to admin.");
            } else {
                return u;
            }
        } catch (EmptyResultDataAccessException ex) {
            return null;
        }
	    
	}

	public List<user> getUserList() {
		String sql="SELCT name FROM user";
		List<user> user = getNamedParameterJdbcTemplate().query(sql,new userRowMapper());
		return user;
		
	}

	public void changeStatus(Integer userID, Integer LoginStatus) {
		String sql = "UPDATE user SET LoginStatus=:lst WHERE userID=:uid";
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("uid", userID);
        map.put("lst", LoginStatus);
        getNamedParameterJdbcTemplate().update(sql, map);

	}
	

}
