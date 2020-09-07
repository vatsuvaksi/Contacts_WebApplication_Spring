package testpackage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vatsuvaksi.configurations.SpringRootConfig;
import vatsuvaksi.dao.UserDAO;
import vatsuvaksi.dao.userDAOimplementation;
import vatsuvaksi.domainClasses.user;

public class TestTwoForBackEnd6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserDAO userr =context.getBean(userDAOimplementation.class);
		//user u= new user("Shrey Mishra","789678","shrey.mishra19@gmail.com","blah blah", "Shreeyyy", "passme",2,1);
		//user u = new user();
		user u=userr.findById(1);
		System.out.println(u.getAddress());
		System.out.println(u.getEmail());
		System.out.println(u.getLoginName());
		System.out.println(u.getName());
		}

}
