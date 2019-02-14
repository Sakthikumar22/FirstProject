package com.chainsys.mail;

public class Email {
	boolean isValidstring(String input)
	{
		boolean isValid= false;
		if(!input.equals(null)&& input.trim().length() !=0)
		{
			isValid= true;
			
		}
		return isValid;
	}
	boolean isValidemail(String email)
	{
		boolean isValid= false;
		if(email.indexOf('@')!= -1 && email.indexOf('.')!= -1)
		{
			isValid= true;
			
		}
		return isValid;
	}
		
		boolean isValidnumber(String mobile)
		{
			boolean isValid= false;
			if(mobile.length()==10 )
			{
				isValid= true;
				
			}
			return isValid;
		
		
		
	}

	 {
		
		// TODO Auto-generated method stub

	}

}
