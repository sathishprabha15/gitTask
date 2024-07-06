package com.guviTask;

public class CompareFourIntVariables {
public static void main(String[] args) {
	int a=10;
	int b=20;
	int c=5;
	int d=15;
	int sum1=a+b;
	System.out.println(sum1);
	int sum2=c+d;
	System.out.println(sum2);
	if(sum1>sum2) {
		System.out.println("Sum of a and b  is greater than sum of c and d");
	}else {
			System.out.println("Sum of d and c  is greater than sum of a and b");
	}
	
	
}
}
