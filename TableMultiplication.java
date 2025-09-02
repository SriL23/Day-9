package com.codegnan.ControlStatements;
import java.util.Scanner;
public class TableMultiplication {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=ob.nextInt();
		System.out.println("Multiplecation Table : "+n);
		for(int i=1;i<=20;i++) {
			System.out.println(n + "*" + i + "=" + n*i);
			ob.close();
		}

	}

}
