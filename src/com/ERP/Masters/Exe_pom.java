package com.ERP.Masters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Exe_pom {
  @Test
  public void logexe() {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://webapp.qedgetech.com");
	  driver.manage().window().maximize();
	  pom_login lb=PageFactory.initElements(driver, pom_login.class);
	  lb.Log_in("admin", "master");
	  pom_stckitm lk=PageFactory.initElements(driver, pom_stckitm.class);
	  lk.stockitem("dvd", "36", "Stock-000000599", "bia", "test1", "70", "100", "awl done");
	  
	  
  }
}
