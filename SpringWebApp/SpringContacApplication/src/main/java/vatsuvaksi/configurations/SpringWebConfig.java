package vatsuvaksi.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@SuppressWarnings("deprecation")
@Configuration
@ComponentScan(basePackages = "vatsuvaksi.service,vatsuvaksi.controller,vatsuvaksi.dao")
@EnableWebMvc
public class SpringWebConfig extends WebMvcConfigurerAdapter {
  //I have created this class for Model View Controller Configurations 
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		//This method is used to handle static resources such as Images js,css files etc
		//super.addResourceHandlers(registry);
	registry.addResourceHandler("/static/**").addResourceLocations("/static/");
	}
	
	@Bean
	public ViewResolver ViewResolver()
	{
		// this method is overriden to set the logical view to internal resources.
		// this ensures that out web-inf folder is being accessed by the source code and not by the external browsers
		InternalResourceViewResolver vr= new InternalResourceViewResolver();
		 vr.setPrefix("/webapp/WEB-INF/view/");
	        vr.setSuffix(".jsp");
	        vr.setViewClass(JstlView.class);
	        vr.setExposeContextBeansAsAttributes(true);
		return vr;
		
	}
	
	
	
}
