package com.guviTask;
import java.util.Scanner;
public class StringLength {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter a string
    System.out.print("Enter a string: ");
    String name = scanner.nextLine();
    
    String withoutSpace = name.replaceAll(" ", "");
System.out.println(withoutSpace);
    // Calculate the length of the string without spaces
    int lengthWithoutSpaces = withoutSpace.length();
	System.out.println(lengthWithoutSpaces);
	
	
}
}
