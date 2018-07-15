package com.fpix.service;

import org.springframework.stereotype.Service;

import com.fpix.pojo.Pojo;
@Service
public class LoginService {
	
	
	public String loginValidation(Pojo p) {
		String u=p.getuName();
		String pass=p.getPassword();
String status = "failure";		
System.out.println(u);
System.out.println(pass);


if(u.equals("admin")&&pass.equals("admin")) {
	System.out.println("controller pass into condition");
	status="sucess";
	return status;
}
/*if(uName.equals("admin")&&password.equals("admin")) {
			System.out.println("controller pass into condition");
			status="sucess";
			return status;
		}		*/
		
		return status;
	}
	
	
}
