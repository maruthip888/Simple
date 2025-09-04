package myprogram;

import java.util.Scanner;

public class program05 {
//Function Simple greetings to accept name as input and print simple greetings as Good morning!
	static void simpleInputAndGreat() {
		Scanner read = new Scanner(System.in);
		String s=read.nextLine();
		System.out.println("Good morning "+s);
	}
	public static void main(String[] args) {
		simpleInputAndGreat();
		
	}

}
