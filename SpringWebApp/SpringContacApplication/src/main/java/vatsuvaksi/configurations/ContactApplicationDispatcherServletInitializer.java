package vatsuvaksi.configurations;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ContactApplicationDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	// This class Initializes the front controller 
	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		// TODO Auto-generated method stub
		return new Class[] {SpringRootConfig.class};
		// This method returns all the classes in which BUSINESS layer is implemented to implement all the beans inside these class	
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// This method returns all the classes in which WEB layer is implemented to implement all the beans inside these classes
		return new Class[] {SpringWebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// This method is used in place of url mapping like in xml 
		return new String[] {"/"} ;

	}
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException
	{
		super.onStartup(servletContext);
		
	}

}
