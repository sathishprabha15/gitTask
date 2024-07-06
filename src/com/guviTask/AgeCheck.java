package com.guviTask;
import java.util.Scanner;

public class AgeCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();

if(age>=60) {
System.out.println("Senior citizen");	
}else {
	System.out.println("Not a senior citizen");
}
}
}
