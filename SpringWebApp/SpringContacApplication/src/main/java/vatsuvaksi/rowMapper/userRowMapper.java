package vatsuvaksi.rowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import vatsuvaksi.domainClasses.user;


public class userRowMapper implements RowMapper<user> {

	public user mapRow(ResultSet rs, int rowNum) throws SQLException {


		user u= new user();
		
		 u.setName(rs.getString("name"));
		 u.setPhone(rs.getString("phone")); 
		 u.setEmail(rs.getString("email")); // stores user's email 
		 u.setAddress(rs.getString("address")); // strores user's address
		 u.setLoginName(rs.getString("LoginName")); // This stores the Login name through which user can Interact 
		 u.setPassword(rs.getString("password")); // this stores the password 
		 u.setRole(rs.getInt("role")); // this stores the role wether he is admin or not. 
		 u.setLoginStatus(rs.getInt("LoginStatus")); // this is the login status of the this user at this present time 
		 u.setUserID(rs.getInt("userID"));
		 return u;
	
	}

}
