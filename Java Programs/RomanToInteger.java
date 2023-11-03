/*
Problem Statement:
Enter a Roman Number as input and convert it to an integer. (ex IX = 9) 
*/

import java.util.Scanner;

public class RomanToInteger 
{
	// Function to convert Roman Number to Integer
	public static int romanToInt(String roman_number)
	{
		int num = 0;
		int result = 0;
		
		// Checking single digit of roman numeral and assigned appropriate integer.
		for(int i = roman_number.length()-1; i >= 0; i--)
		{
			switch(roman_number.charAt(i))
			{
				case 'I': 
				case 'i': num = 1;
						  break;
				case 'V': 
				case 'v': num = 5;
				          break;
				case 'X': 
				case 'x': num = 10;
				          break;
				case 'L': 
				case 'l': num = 50;
				          break;
				case 'C': 
				case 'c': num = 100;
				          break;
				case 'D': 
				case 'd': num = 500;
				          break;
				case 'M': 
				case 'm': num = 1000;
				          break;
			}
			
			
			if(4 * num < result)
				result -= num;
			else
				result += num;
		}
		
		return result;
	}
	
	public static void main(String args[])
	{
		String roman_number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roman Number: ");
		roman_number = sc.next();
		System.out.println("Roman Number " +roman_number.toUpperCase()+ " to Integer: "+romanToInt(roman_number));
	}
}

/*****************************Output*****************************
Enter Roman Number: IX
Roman Number IX to Integer: 9

Enter Roman Number: DCCCL
Roman Number DCCCL to Integer: 850
*/

