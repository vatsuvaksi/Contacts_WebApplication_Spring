package testpackage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vatsuvaksi.configurations.SpringRootConfig;
import vatsuvaksi.dao.UserDAO;
import vatsuvaksi.dao.userDAOimplementation;
import vatsuvaksi.domainClasses.user;

public class TestTwoForBackEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserDAO userr =context.getBean(userDAOimplementation.class);
		//user u= new user("Shrey Mishra","789678","shrey.mishra19@gmail.com","blah blah", "Shreeyyy", "passme",2,1);
		user u = new user();
		u.setAddress("21dcs");
		u.setEmail("naimis@l.com");
		u.setLoginName("naimish");
		u.setLoginStatus(1);
		u.setName("naijms");
		u.setPassword("passmeplz");
		u.setPhone("321");
		u.setRole(2);
	
		userr.save(u);
		}

}
