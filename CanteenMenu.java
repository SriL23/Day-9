package com.codegnan.ControlStatements;
import java.util.Scanner;
public class CanteenMenu {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int ch;
		int c=0;
		int a=0;
		do {
			System.out.println("||========CANTEEN MENU========||");
			System.out.println("1. View Menu");
			System.out.println("2. Select Item");
			System.out.println("3. View Bill");
			System.out.println("4. Checkout and Exit");
			System.out.println("Enter Your Choice");
			ch=ob.nextInt();
			switch(ch) {
			case 1:
				System.out.println("1. Tea  -₹10");
				System.out.println("2. Coffee  -₹15");
				System.out.println("3. Samosa  -₹20");
				break;
			case 2:
				System.out.println("Enter Item Number to Order(1-3) : ");
				c=ob.nextInt();
				System.out.println("Enter Quantity : ");
				a=ob.nextInt();
				if(a>0) {
				switch(c) {
				case 1:
					System.out.println(a + "Tea Added");
					break;
				case 2:
					System.out.println(a + "Coffee Added");
					break;
				case 3:
					System.out.println(a + "Samosa Added");
					break;
				default:
                    System.out.println("Invalid item number!");
                    c = 0; 
				}
				}
				
				else {
					System.out.println("Quantity must be Greater than 0");
				}
				
					
				break;
			case 3:
				System.out.println("-------Bill-------");
			
				if( c==1) {
					int r=a*10;
					System.out.println("Tea" + " * " +a + "=" +"₹"+r);
				}
				else if(c==2) {
					int r2=a*15;
					System.out.println("Coffee" + " * " +a + "=" +"₹"+r2);
				}
				else {
					int r3=a*20;
					System.out.println("Samosa" + " * " +a + "=" +"₹"+r3);
				}
				break;
			case 4:
				System.out.println("Thank You! Exiting System");
				
			}
		}
		while(ch!=4);
		ob.close();
		
	}

}
