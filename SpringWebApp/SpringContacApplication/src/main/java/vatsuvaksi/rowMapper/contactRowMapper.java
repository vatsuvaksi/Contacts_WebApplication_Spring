package vatsuvaksi.rowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import vatsuvaksi.domainClasses.contact;


public class contactRowMapper implements RowMapper<contact> {

	public contact mapRow(ResultSet rs, int rowNum) throws SQLException {


		contact c= new contact();
		
		 c.setName(rs.getString("name"));
		 c.setPhone(rs.getString("phone")); 
		 c.setEmail(rs.getString("email")); // stores user's email 
		 c.setAddress(rs.getString("address")); // strores user's address
		 c.setContactId(rs.getInt("contactId"));
		 c.setRemark(rs.getString("remark"));
		 c.setIdUser(rs.getInt("idUser"));
		 
		 return c;
	
	}

}
