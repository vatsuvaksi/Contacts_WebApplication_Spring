package vatsuvaksi.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TestController {
//Not working FIx before this weekend;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	 @RequestMapping(value= "/test/hello")
	 public String helloWorld()
	 
	 {
		 return "hello";
	 }
}
