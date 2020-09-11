package vatsuvaksi.configurations;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "vatsuvaksi.dao,vatsuvaksi.service,vatsuvaksi.controller")
public class SpringRootConfig {
	// I have created this classs for implementing the business or logic layer configuration 

	//TODO business Layer beans ;
	
	@Bean
	public BasicDataSource getDataSource() // This data Source will help to suppy the user or contact to JDBC template 
	{
		// This basically initialises the Spring JDBC drivers for usage 
		BasicDataSource dataSource=new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/contactapp_db");
		dataSource.setUsername("root");
		dataSource.setPassword("Passup78dr9537titanhello");
		dataSource.setMaxActive(2);
		dataSource.setInitialSize(1);
		dataSource.setTestOnBorrow(true);
		dataSource.setValidationQuery("SELECT 1");
		dataSource.setDefaultAutoCommit(true);
		return dataSource;

	}
	
}
