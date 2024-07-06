package com.guviTask;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int number = scanner.nextInt();

	boolean prime=true;
	
	for(int i=2;i<number;i++) {
		if(number%i==0) {
			prime=false;
			break;
		}
	}
	if(prime==true) {
		System.out.println("It is a prime number");
	}else {
		System.out.println("It is not a prime number");
	}
}
}
