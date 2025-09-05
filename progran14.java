package myprogram;

import java.util.Scanner;

public class progran14 
{
//Function to find the string is Palindrome,function isPalindrome return true if string is palindrome
	static boolean isPalindrome(String input)
	{
		boolean result=true;
		int leftindex=0;
		int rightindex=input.length()-1;
		while(leftindex<rightindex)
		{
			if(input.charAt(leftindex) != input.charAt(rightindex)) {
				result=false;
				break;
			}
			leftindex++;
			rightindex--;
		}
		return result;
	}
	static void invoke_isPalindrome()
	{
		Scanner read =new Scanner(System.in);
		String input=read.nextLine();
		boolean result=isPalindrome(input);
		if(result == true)
		System.out.print("The given string is palindrome");
		else
		{
			System.out.print("The given string is NOT  palindrome");
		}
	}	
		public static void main(String[] args) {
			invoke_isPalindrome();
		}
}
