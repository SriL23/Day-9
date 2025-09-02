package com.codegnan.ControlStatements;
import java.util.Scanner;
public class ReversofNumber {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n=ob.nextInt();
		int org=n;
		int rev=0;
		while(n!=0) {
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		if(rev<0) {
			System.out.println(-(rev));
		}
		else
		System.out.println("Reversed Number is: "+ org + " = " + rev);
		
		ob.close();

	}

}

//1) 