package testpackage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vatsuvaksi.configurations.SpringRootConfig;
import vatsuvaksi.dao.UserDAO;
import vatsuvaksi.dao.userDAOimplementation;
import vatsuvaksi.domainClasses.user;

public class TestTwoForBackEnd3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserDAO userr =context.getBean(userDAOimplementation.class);
		//user u= new user("Shrey Mishra","789678","shrey.mishra19@gmail.com","blah blah", "Shreeyyy", "passme",2,1);
		user u = new user();
		u.setUserID(2);
		u.setAddress("Mishra market");
		u.setEmail("Shrey.mishra@gmail.com");
		u.setLoginName("Shreeyyy");
		u.setLoginStatus(1);
		u.setName("Shrey");
		u.setPassword("passme");
		u.setPhone("321112111");
		u.setRole(2);
	
		userr.update(u);
		}

}
