package com.fpix.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fpix.pojo.Pojo;
import com.fpix.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	@RequestMapping("/login.htm")


public ModelAndView login(HttpServletRequest request,HttpServletResponse responce) {

	Pojo p=new Pojo();
	String uName=request.getParameter("userName");
	String password=request.getParameter("password");
	
	p.setuName(uName);
	p.setPassword(password);
	
	System.out.println(p.getuName());
	System.out.println(p.getPassword());
	//LoginService loginService=new LoginService();
	String status=loginService.loginValidation(p);
	System.out.println(status);
	
	/*String status=ls.loginValidation();
	
	System.out.println(status);
	*/
	
	
	/*if(uName.equals("admin")&&password.equals("admin")) {
		System.out.println("controller pass into condition");
	}*/
	ModelAndView mv=new ModelAndView();
	mv.addObject("status",status);
	mv.setViewName("Output.jsp");
	
	
	return mv;
	
}
	
	
	
	
}
