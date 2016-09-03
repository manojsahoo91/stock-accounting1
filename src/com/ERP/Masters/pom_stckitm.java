package com.ERP.Masters;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class pom_stckitm {

	
	@FindBy(xpath=".//*[@id='mi_a_stock_items']/a")
	WebElement si;
	@FindBy(xpath=".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")
	WebElement add1;
	@FindBy(id="x_Category")
	WebElement cat1;
	@FindBy(id="x_Supplier_Number")
	WebElement sn1;
	@FindBy(id="x_Stock_Number")
	WebElement stk_no1;
	@FindBy(id="x_Stock_Name")
	WebElement stckn1;
	@FindBy(id="x_Unit_Of_Measurement")
	WebElement uom1;
	@FindBy(id="x_Purchasing_Price")
	WebElement pp1;
	@FindBy(id="x_Selling_Price")
	WebElement sp1;
	@FindBy(id="x_Notes")
	WebElement note1;
	@FindBy(id="btnAction")
	WebElement add2;
	@FindBy(xpath="html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")
	WebElement con1;
	@FindBy(xpath="html/body/div[17]/div[2]/div/div[4]/div[2]/button")
	WebElement alrt1;
	
	public void stockitem(String cat2,String sn2,String stk_no2,String stckn2,String uom2,String pp2,String sp2,String note2){
		
	si.click();
		add1.click();
	Select sl=new Select(cat1);
	sl.selectByVisibleText(cat2);
	Select sq=new Select(sn1);
	sq.selectByVisibleText(sn2);
	stk_no1.sendKeys(stk_no2);	
	Select sf=new Select(uom1);
	sf.selectByVisibleText(uom2);
	pp1.sendKeys(pp2);
	sp1.sendKeys(sp2);
	note1.sendKeys(note2);
	
	   
	
		
		
		
	}
	
}
