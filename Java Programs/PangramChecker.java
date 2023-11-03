/*
 Problem Statement:
 Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet from a-z)
*/

import java.util.Scanner;

public class PangramChecker 
{
    // Function to check whether given input string is pangram or not.
    public static boolean isPangram(String input) 
    {
    	// Converting all the characters of input to lowercase.
        input = input.toLowerCase();
        
        // Array to store presence of each letter.
        boolean[] alphabetPresent = new boolean[26];
        
        if(input.length() < 26)
        {
        	return false;
        }
        
        // To check each and every character in input.
        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') 
            {
                int index = ch - 'a';
                alphabetPresent[index] = true;
            }
        }

        // To check if all alphabet letters are present.
        for (int i = 0; i < 26; i++) 
        {
            if (!alphabetPresent[i])
            {
                return false; 
            }
        }

        return true; 
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence to check if it's a pangram:");
        String input = sc.nextLine();
        
        if (isPangram(input)) 
        {
            System.out.println("The input \""+ input +"\" is a pangram.");
        }
        else 
        {
            System.out.println("The input \""+ input +"\" is not a pangram.");
        }
    }

}

/*************************Output*************************

Enter a sentence to check if it's a pangram:
The quick brown fox jumps over the lazy dog
The input "The quick brown fox jumps over the lazy dog" is a pangram.

Enter a sentence to check if it's a pangram:
The quick brown fox jumps over the dog
The input "The quick brown fox jumps over the dog" is not a pangram.
*/

