package com.codegnan.ControlStatements;
import java.util.Scanner;
public class FactorialofaNumber {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=ob.nextInt();
		int res=1;
		for(int i=1;i<=n;i++) {
			res=res*i;
		}
		System.out.println("Factorial of a Number is: "+res);
		ob.close();

	}

}