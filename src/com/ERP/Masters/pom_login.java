package com.ERP.Masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pom_login {
	
	
	@FindBy(id="username")
	WebElement usern;
	@FindBy(id="password")
	WebElement pswd;
	@FindBy(id="btnsubmit")
	WebElement login;
	@FindBy(id="btnreset")
	WebElement reset;
	
	
	
	


public void Log_in(String un,String pwd){
	reset.click();
	usern.sendKeys(un);
	pswd.sendKeys(pwd);
	login.click();
	
}
	
	
}