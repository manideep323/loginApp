package com.fpix.pojo;

public class Pojo {
private String uName;
private String password;


public String getuName() {
	System.out.println("pojo");
	return uName;
}
public void setuName(String uName) {
	System.out.println("pojo");
	this.uName = uName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "pojo [uName=" + uName + ", password=" + password + "]";
}

}
