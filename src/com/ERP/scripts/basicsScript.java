package com.ERP.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class basicsScript {

	
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		String Expval="Login";
		
		
		driver.get("http://webapp.qedgetech.com");
		driver.manage().window().maximize();
		String actval=driver.findElement(By.id("btnsubmit")).getText();
		if ( Expval.equalsIgnoreCase(actval)) {
			System.out.println("url diplayed");
			
		}else {
			System.out.println("url not displayed");
		}
		
		
		driver.findElement(By.id("btnreset")).click();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
		String expval="Administrator";

		String act=driver.findElement(By.xpath(".//*[@id='msUserName']/font/strong")).getText();
		System.out.println(act);
		if (expval.equalsIgnoreCase(act)) {
			System.out.println("text found");
			
		}else {
			System.out.println("text not found");
			}
		Actions s=new Actions(driver);
		s.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
		driver.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a")).click();
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.id("x_Category_Name")).sendKeys("mobiles");
		driver.findElement(By.id("btnAction")).click();
		driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
		//supliers
		driver.findElement(By.linkText("Suppliers")).click();
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.id("x_Supplier_Number")).sendKeys("Supplier-12345");
		driver.findElement(By.id("x_Supplier_Name")).sendKeys("manoj");
		driver.findElement(By.id("x_Address")).sendKeys("Hyderabad");
		driver.findElement(By.id("x_City")).sendKeys("secunderabad");
		driver.findElement(By.id("x_Country")).sendKeys("india");
		driver.findElement(By.id("x_Contact_Person")).sendKeys("deepak");
		driver.findElement(By.id("x_Phone_Number")).sendKeys("123456");
		driver.findElement(By.id("x__Email")).sendKeys("manojsahoo91@gmail.com");
		driver.findElement(By.id("x_Mobile_Number")).sendKeys("9938221871");
		driver.findElement(By.id("x_Notes")).sendKeys("awl done");
		driver.findElement(By.id("btnAction")).click();
        driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
    	Sleeper.sleepTightInSeconds(2);
        driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
        
       // driver.findElement(By.xpath(".//*[@id='mi_logout']/a/i")).click();
        Actions s1=new Actions(driver);
    	s1.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
    	
    	driver.findElement(By.xpath(".//*[@id='mi_a_unit_of_measurement']/a")).click();
    	Sleeper.sleepTightInSeconds(1);
    	driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
    	Sleeper.sleepTightInSeconds(1);
    	driver.findElement(By.id("x_UOM_ID")).sendKeys("manojsah91");
    	driver.findElement(By.id("x_UOM_Description")).sendKeys("stock accounting");
    	driver.findElement(By.id("btnAction")).click();
    	Sleeper.sleepTightInSeconds(2);
    	driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
    	Sleeper.sleepTightInSeconds(1);
    	driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
      List<WebElement> str=   driver.findElements(By.tagName("a"));
      System.out.println(str.size());
    for (int i = 0; i <str.size() ; i++) {
    	System.out.println(str.get(i).getText());
		
	}
   Actions s2=new Actions(driver);
   s2.moveToElement(driver.findElement(By.xpath(".//*[@id='mci_Administrator']/a"))).build().perform();
   driver.findElement(By.xpath(".//*[@id='mi_timezone']/a")).click();
   driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
   driver.findElement(By.id("x_Timezone")).sendKeys("german");
   Sleeper.sleepTightInSeconds(1);
   driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
   driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
   //logout
   driver.findElement(By.id("logout")).click();
   driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
  Sleeper.sleepTightInSeconds(2);
    
        
	}
	
	
}
	

