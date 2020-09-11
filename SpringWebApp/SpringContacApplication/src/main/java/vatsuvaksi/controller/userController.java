package vatsuvaksi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userController {

	@RequestMapping(value= {"/userLogin"})
	public String indexPage()
	{
		return "loginPage";
	}

}
