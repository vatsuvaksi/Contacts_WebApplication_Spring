package testpackage;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vatsuvaksi.configurations.SpringRootConfig;
import vatsuvaksi.dao.UserDAO;
import vatsuvaksi.dao.userDAOimplementation;
import vatsuvaksi.domainClasses.user;

public class TestTwoForBackEnd7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserDAO userr =context.getBean(userDAOimplementation.class);
		//user u= new user("Shrey Mishra","789678","shrey.mishra19@gmail.com","blah blah", "Shreeyyy", "passme",2,1);
		//user u = new user();
		List<user> u=userr.findAll();
		for(user b : u)
		{
			System.out.println(b.getAddress());
			System.out.println(b.getEmail());
			System.out.println(b.getLoginName());
			System.out.println(b.getName());
				
		}
		

}
}
