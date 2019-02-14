package com.chainsys.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		int num=10;
		try{
			int result=(num/10);
			System.out.println(result);
			
			
			
		
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		
	}

}
