package testpackage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vatsuvaksi.configurations.SpringRootConfig;
import vatsuvaksi.domainClasses.user;
import vatsuvaksi.service.userService;
import vatsuvaksi.service.userServiceImplementation;

public class TestUserServiceRegister {
    private static AnnotationConfigApplicationContext ctx;

	public static void main(String[] args) {
        ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        userService userService=(userService)ctx.getBean(userService.class);
        //TODO: the user details will be taken from User-Reg-Form
        user u=new user();
        u.setName("Nitin");
        u.setPhone("55555555");
        u.setEmail("nitin@blahblah.net");
        u.setAddress("Mumbai");
        u.setLoginName("nitin");
        u.setPassword("nitin123");
        u.setRole(vatsuvaksi.service.userService.RoleAdmin);
        u.setLoginStatus(vatsuvaksi.service.userService.LoginStatusActive);
        userService.register(u);
        System.out.println("--------User Registered Successfully------");
    }    
}