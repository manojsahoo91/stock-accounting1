package com.ERP.Masters;

public class Exelib {

	
	public static void main(String[] args) throws Exception {
		stocklib sl=new stocklib();
		String res=sl.openAPP("http://webapp.qedgetech.com");
		System.out.println(res);
		res=sl.Admlogin("admin", "master");
		System.out.println(res);                                                                   
		res=sl.stockcat("Mobiles");                                                     
		System.out.println(res);
		res=sl.unitmsrmnt("manojsahoo91","stock accounting");
		System.out.println(res);
		res=sl.suppliers("supplier-12345", "manoj kumar sahoo", "hyderabad", "dhenkanal", "syria", "deepak", "9938221871", "manojsahoo91@gmail.com", "8096194700", "awl done");
	    System.out.println(res);
	    res=sl.Logout();
	    System.out.println(res);
	}                                                                                
	}
                                                         

                                                                                        
                                                                                           
                                                                                       
                                                                                      





                                                                                              