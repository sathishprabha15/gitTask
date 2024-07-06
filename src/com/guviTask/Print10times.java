package com.guviTask;

import java.util.Scanner;

public class Print10times {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter a string
    System.out.print("Enter a string: ");
    String repeat = scanner.nextLine();

	for(int i=0;i<=10;i++) {
		System.out.println(repeat);
	}
}
}
