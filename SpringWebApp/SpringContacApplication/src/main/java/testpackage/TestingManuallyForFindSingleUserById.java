package testpackage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import vatsuvaksi.configurations.SpringRootConfig;
import vatsuvaksi.dao.UserDAO;
import vatsuvaksi.dao.userDAOimplementation;
import vatsuvaksi.domainClasses.user;

public class TestingManuallyForFindSingleUserById {

	
	AnnotationConfigApplicationContext con= new AnnotationConfigApplicationContext(SpringRootConfig.class);
	UserDAO userr=con.getBean(userDAOimplementation.class);
	user okay=userr.findById(1);
	
	
	
	
	
}
