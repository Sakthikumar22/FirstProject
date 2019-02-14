package com.chainsys.arrays;

import java.util.Scanner;

public class Markarrays {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the values");
		int noofmarks=scanner.nextInt();
		int sumofmarks=0;
		int marks[]=new int[noofmarks];
		
		
		for(int i=0;i<noofmarks;i++)
		{
			
			marks[i]=scanner.nextInt();
			sumofmarks=sumofmarks+marks[i];
			
		}
		System.out.println(sumofmarks);
		 int avgmark=(sumofmarks/noofmarks);
		 System.out.println(avgmark);
		 scanner.close();
		
		
		// TODO Auto-generated method stub

	}

}
