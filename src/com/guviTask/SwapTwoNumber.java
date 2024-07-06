package com.guviTask;
import java.util.Scanner;
public class SwapTwoNumber {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

     // Prompt the user to enter the first number
     System.out.print("Enter the first number: ");
     int num1 = scanner.nextInt();

     // Prompt the user to enter the second number
     System.out.print("Enter the second number: ");
     int num2 = scanner.nextInt();

     // Display the original values
     System.out.println("Before swapping:");
     System.out.println("First number: " + num1);
     System.out.println("Second number: " + num2);

     //Swapping the values
	int num3=num1;
		num1=num2;
		num2=num3;
	
	 // Display the swapped values
    System.out.println("After swapping:");
    System.out.println("First number: " + num1);
    System.out.println("Second number: " + num2);

}
}
