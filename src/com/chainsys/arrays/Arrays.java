package com.chainsys.arrays;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		String[] Students= new String[10];
		Scanner scanner =new  Scanner(System.in);
		 
		for(int i=0;i<10;i++)
		{
			String Student =scanner.next();
			System.out.println(Student);
		}
		scanner.close();
		
		// TODO Auto-generated method stub

	}

}
