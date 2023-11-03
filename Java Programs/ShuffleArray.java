/*
Problem Statement:
Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it. 
*/

import java.util.Random;
import java.util.Scanner;

public class ShuffleArray 
{
	// Function to shuffle elements of an array.
	public static void shuffleArray(int array[], int size)
	{
		Random random = new Random();
		
		// Shuffle elements with random index.
		for(int i = 1; i < size; i++)
		{
			int j = random.nextInt(i);
			
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}
	
	// Function to display elements of array.
	public static void printArray(int array[], int size)
	{
		for(int i = 0; i < size; i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	
	public static void main(String args[])
	{
		int size;
		int array[];
		System.out.print("Enter Size of Array: ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		array = new int[size];
		
		System.out.println("Enter Elements of an Array: ");
		for(int i = 0; i < size; i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println("Elements of an Array Before Shuffle: ");
		printArray(array, size);
		shuffleArray(array, size);
		System.out.println("\nElements of an Array After Shuffle: ");
		printArray(array, size);
		shuffleArray(array, size);
		System.out.println("\nElements of an Array After Shuffle: ");
		printArray(array, size);
		
	}

}

/************************************Output************************************
Enter Size of Array: 7
Enter Elements of an Array: 
1 2 3 4 5 6 7
Elements of an Array Before Shuffle: 
1 2 3 4 5 6 7 
Elements of an Array After Shuffle: 
3 7 6 1 4 2 5 
Elements of an Array After Shuffle: 
6 3 1 2 5 4 7 
*/

