package com.ERP.Masters;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseNg {
 public static stocklib sl=new stocklib();
  @BeforeTest
  public void beforeTest() {
	  sl.Admlogin("admin", "master");
  }

  @AfterTest
  public void afterTest() {
	  sl.Logout();
  }

  @BeforeSuite
  public void beforeSuite() throws Exception {
	  sl.openAPP("http://webapp.qedgetech.com");
  }

  @AfterSuite
  public void afterSuite() {
	  sl.appclose();
	  
  }

}
