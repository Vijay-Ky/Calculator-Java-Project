package com.calculation;
import com.addition.Addition;
import com.subtraction.Subtraction;
import com.multiplication.Multiplication;
import com.division.Division;

import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args)
	{
		int choice = 0;
		Scanner input = new Scanner(System.in);
		float n1, n2;
		
		System.out.println("\nWelcome to Calculator Project!");
		
		try
		{
			while(choice != 5)
			{
				System.out.println("\n1 - Addition");
				System.out.println("2 - Subtration");
				System.out.println("3 - Multiplication");
				System.out.println("4 - Division");
				System.out.println("5 - Exit");
				System.out.println("\n Enter your Choice");
					
				choice = input.nextInt();
				
				if(choice <= 0 || choice > 5)
				{
					System.out.println("\n Please Select the Available Choice!");
					
				}
			
					System.out.println("\nEnter First value");
					n1 = input.nextFloat();
					
					System.out.println("\nEnter Second value");
					n2 = input.nextFloat();
				
				if(choice == 5)
				{
					System.out.println("\nThanks for using");
					System.exit(0);
				}
				
				if(choice == 1)
				{
					System.out.println("Sum: " + Addition.addition(n1, n2));
				}
				
				else if(choice == 2)
				{
					System.out.println("Subtraction: " + Subtraction.subtraction(n1, n2));
				}
				
				else if(choice == 3)
				{
					System.out.println("Multiplication: " + Multiplication.multiplication(n1, n2));
				}
				
				else if(choice == 4)
				{
					System.out.println("Division: " + Division.division(n1, n2));
				}
			}
		}
		catch(Exception ex)
		{
			System.out.println("\nError: " + ex.toString() + " Occured");
		}		
	}
}
