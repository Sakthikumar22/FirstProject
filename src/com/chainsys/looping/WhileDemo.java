package com.chainsys.looping;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		int t;
		Scanner scanner = new Scanner(System.in);
		do {

			t = scanner.nextInt();
			System.out.println(t);

		} while (t < 5);

		scanner.close();
	}
}
