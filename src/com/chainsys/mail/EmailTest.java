package com.chainsys.mail;

import java.util.Scanner;

public class EmailTest {

	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String email=scanner.next();
		String mobile=scanner.next();
		 
		Email emailtest = new Email();
		boolean emailTest=emailtest.isValidemail(email);
	   boolean emailnum=emailtest.isValidnumber(mobile);
	    boolean emailstring=emailtest.isValidstring(mobile); 
	    boolean emailvalue=emailtest.isValidstring(email);
	    
	    if(emailTest==emailvalue)
	    {
	    
	    	System.out.println("VALID EMAIL");
	    }else
	    {
	    	System.out.println("INVALID");
	    
	    }
	    
	    if(emailnum==emailstring)
	    {
	    	System.out.println("VALID NUM ");
	    }
	    else
	    {
	    	System.out.println("INVALID");
	    }
	    
	   scanner.close();
	   
		
		
		}
		
		
			
				
		
		// TODO Auto-generated method stub

	}


