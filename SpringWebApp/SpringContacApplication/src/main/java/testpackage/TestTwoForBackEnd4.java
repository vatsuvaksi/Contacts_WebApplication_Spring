package testpackage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vatsuvaksi.configurations.SpringRootConfig;
import vatsuvaksi.dao.UserDAO;
import vatsuvaksi.dao.userDAOimplementation;

public class TestTwoForBackEnd4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		UserDAO userr =context.getBean(userDAOimplementation.class);
		//user u= new user("Shrey Mishra","789678","shrey.mishra19@gmail.com","blah blah", "Shreeyyy", "passme",2,1);
		
		userr.deleteById(2);
		context.close();
		}

}
