package co.inTest1;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	int number = sc.nextInt();
	
	int fact = 1;
	for(int i=1;i<=number;i++) {
		fact=fact*i;
    System.out.println("factorial is: "+fact);
		
	}
	}

}
