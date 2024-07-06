package com.guviTask;

import java.util.Scanner;

public class IntegerCount {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int number = scanner.nextInt();

	String count = String.valueOf(number);
	int length = count.length();
	System.out.println(length);
}
}
