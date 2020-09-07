package testpackage;

import javax.sql.DataSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import vatsuvaksi.configurations.SpringRootConfig;

public class testOneForBackEnd {
//This is an independant class from tomCat server to test DataBase connectivity
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext cont= new AnnotationConfigApplicationContext(SpringRootConfig.class);
		DataSource data=cont.getBean(DataSource.class);
		JdbcTemplate jd= new JdbcTemplate(data);
		String sqlquery= "INSERT INTO user(name,phone,email,address,loginName,password) VALUES (?,?,?,?,?,?)";
		Object[] parameters =new Object[] {"Vatsal","9621878599", "vatsuvaksi@gmail.com","address hei mera","vatsuvaksi","password"};
		jd.update(sqlquery,parameters);
		System.out.println("------------SQL BUILT----------------------");
		cont.close();
	}

}
