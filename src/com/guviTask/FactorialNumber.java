package com.guviTask;

import java.util.Scanner;

public class FactorialNumber {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int number = scanner.nextInt();

	int fact=1;
	
	for(int i=1;i<=5;i++) {
		fact=fact*i;
	}
	System.out.println(fact);
}
}
