package vatsuvaksi.dao;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;



// not to use @repository or @service or @component annotation because no need to add this in the IOC container 
 abstract public class BaseDAO extends NamedParameterJdbcDaoSupport {
	
	 @Autowired
	 public void setDataSourceobj(DataSource ds)
	{
		 //This returns the data source to the parent class that is NamedParameterJdbcDaoSupport then later that data will be used by it's function such as update and execute 
		super.setDataSource(ds);
	}

	

}
