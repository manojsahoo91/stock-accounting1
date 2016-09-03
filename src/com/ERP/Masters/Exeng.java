package com.ERP.Masters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exeng extends BaseNg {
  @Test(dataProvider="Udata")
  public void uom(String uid,String udes) {
	  sl.unitmsrmnt(uid,udes);
  }
  @DataProvider
  public Object[][] Udata(){
	  Object[][] obj=new Object[3][2];
	  obj[0][0]="file1";
	  obj[0][1]="sele1";
	  obj[1][0]="file2";
	  obj[1][1]="sele2";
	  obj[2][0]="file2";
	  obj[2][1]="sele2";
	return obj ;
	  
  }
}
