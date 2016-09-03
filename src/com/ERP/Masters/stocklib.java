package com.ERP.Masters;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;                      
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
                                                                                       
public class stocklib 
{
public static WebDriver driver;
public static String Expval,Actval;
public Properties pr;
public FileInputStream fis;
public String openAPP( String Url) throws Exception{    
	pr=new Properties();
	fis=new FileInputStream("D:\\workspace1\\ERP_Automation\\src\\com\\ERP\\properties\\ERP1.properties");
	pr.load(fis);
	 Expval="Login";                                  
	 driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 driver.get(Url);
	 Actval=driver.findElement(By.id("btnsubmit")).getText();
	 if (Expval.equalsIgnoreCase(Actval)) {
		 return "pass";
		
	}else {
		return "fail";
	}
	 
	
}

public String Admlogin(String un,String pwd){

	Expval="Administrator";

	driver.findElement(By.id(pr.getProperty("reset"))).click();
	driver.findElement(By.id(pr.getProperty("Uname"))).sendKeys(un);
	driver.findElement(By.id(pr.getProperty("pwd"))).sendKeys(pwd);
	driver.findElement(By.id(pr.getProperty("submit"))).click();
	 Actval=driver.findElement(By.xpath(pr.getProperty("valida"))).getText();
	
	
		if (Expval.equalsIgnoreCase(Actval)) {
			//System.out.println("text found");
			return "pass";
			
		}else {
			//System.out.println("text not found");
			return "Fail";
			}

	
}
//stockcat
public String stockcat(String cat){
	Actions s=new Actions(driver);
	s.moveToElement(driver.findElement(By.xpath(pr.getProperty("stockitem")))).build().perform();
	driver.findElement(By.xpath(pr.getProperty("stockcat"))).click();
	driver.findElement(By.xpath(pr.getProperty("add1"))).click();
	Sleeper.sleepTightInSeconds(2);
	driver.findElement(By.id(pr.getProperty("catName"))).sendKeys(cat);
	driver.findElement(By.id(pr.getProperty("add2"))).click();
	driver.findElement(By.xpath(pr.getProperty("confirm1"))).click();
	Sleeper.sleepTightInSeconds(2);
	driver.findElement(By.xpath(pr.getProperty("alert1"))).click();
	return "pass";
	
}
public String unitmsrmnt(String id,String desc){
	Actions s1=new Actions(driver);
	s1.moveToElement(driver.findElement(By.xpath(pr.getProperty("stockitem")))).build().perform();
	
	driver.findElement(By.xpath(pr.getProperty("uom"))).click();
	Sleeper.sleepTightInSeconds(1);
	driver.findElement(By.xpath(pr.getProperty("add1"))).click();
	Sleeper.sleepTightInSeconds(1);
	driver.findElement(By.id(pr.getProperty("uomid"))).sendKeys(id);
	driver.findElement(By.id(pr.getProperty("uomdes"))).sendKeys(desc);
	driver.findElement(By.id(pr.getProperty("add2"))).click();
	Sleeper.sleepTightInSeconds(2);
	driver.findElement(By.xpath(pr.getProperty("confirm1"))).click();
	Sleeper.sleepTightInSeconds(1);
	driver.findElement(By.xpath(pr.getProperty("alert1"))).click();
	return "pass";
}
public String suppliers(String Sn,String name,String addr,String city,String country,String cp,String pn,String email,String mb,String notes){
	driver.findElement(By.linkText(pr.getProperty("suppl"))).click();
	driver.findElement(By.xpath(pr.getProperty("add1"))).click();
	Sleeper.sleepTightInSeconds(2);
	driver.findElement(By.id(pr.getProperty("supplno"))).sendKeys(Sn);
	driver.findElement(By.id(pr.getProperty("supplname"))).sendKeys(name);
	driver.findElement(By.id(pr.getProperty("addr"))).sendKeys(addr);
	driver.findElement(By.id(pr.getProperty("city"))).sendKeys(city);
	driver.findElement(By.id(pr.getProperty("cntry"))).sendKeys(country);
	driver.findElement(By.id(pr.getProperty("cntctperson"))).sendKeys(cp);
	driver.findElement(By.id(pr.getProperty("cn"))).sendKeys(pn);
	driver.findElement(By.id(pr.getProperty("mail"))).sendKeys(email);
	driver.findElement(By.id(pr.getProperty("mob"))).sendKeys(mb);
	driver.findElement(By.id(pr.getProperty("note"))).sendKeys(notes);
	driver.findElement(By.id(pr.getProperty("btn"))).click();
    driver.findElement(By.xpath(pr.getProperty("confirm1"))).click();
	Sleeper.sleepTightInSeconds(2);
    driver.findElement(By.xpath(pr.getProperty("alert1"))).click();
	return "suplier passed";
    
}
public String Logout(){
	driver.findElement(By.xpath(pr.getProperty("Lo"))).click();
	Sleeper.sleepTightInSeconds(2);
	    return "logged out";
	
}
public void appclose(){
	driver.close();
}
}

