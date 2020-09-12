package vatsuvaksi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vatsuvaksi.commands.loginCommand;
import vatsuvaksi.domainClasses.user;
import vatsuvaksi.exceptions.userBlockedExceptions;
import vatsuvaksi.service.userService;

@Controller
public class userController {

	@Autowired
	private userService userService;
	@RequestMapping(value= {"/","/userLogin"})	
	public String indexPage(Model m)
	{
		m.addAttribute("command", new loginCommand());
		return "userLogin";
	}
	@RequestMapping(value= "/login" , method = RequestMethod.POST)	
	public String handleLogin(Model m, @ModelAttribute("command") loginCommand cmd) 
	{
		try {
			user loggedInUser=userService.login(cmd.getLoginName(),cmd.getPassword());
			if(loggedInUser == null) // if it fails 
			{
				m.addAttribute("err", "Login failed, please enter valid credentials");
				return "userLogin";
				
			}else // if everthing is okay 
			{
			if(loggedInUser.getRole().equals(vatsuvaksi.service.userService.RoleAdmin))
			{
				return "redirect: /admin/dashboard";
				
			}else if(loggedInUser.getRole().equals(vatsuvaksi.service.userService.RoleUser)) {
				return "redirect: /user/dashboard";
			}
			else {
				m.addAttribute("err", "Invalid user role");
				return "userLogin";
			}
			}
			
		} catch (userBlockedExceptions e) {
			// TODO Auto-generated catch block
			m.addAttribute("err", e.getMessage());
			return "userLogin";
		}
		
		
		
	}
	@RequestMapping(value= {"/user/dashboard"})	
	public String userDashboard()
	{
		return "dashboard_user";
	}
	@RequestMapping(value= {"/admin/dashboard"})	
	public String adminDashboard()
	{
		return "dashboard_admin";
	}
}
