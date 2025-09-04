package myprogram;

import java.util.Scanner;

public class program08 {
	//Function to count vowels getcountofvowel for a given String
	static int getcountofvowel(String input) {
		int count=0;
		for(int index=0; index<input.length();index++) {
			char character=input.charAt(index);
			     if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' )
			     count++;
		}
		return count;
	}
	static void invoke_getCountOfVowels() {
		Scanner read=new Scanner(System.in);
		String input=read.nextLine();//input is taken from the user
		int count=getcountofvowel(input);
		System.out.println("Number of vowels in a String "+input+"  "+count);
	}
	public static void main(String[] args) {
		invoke_getCountOfVowels();
	}
}
