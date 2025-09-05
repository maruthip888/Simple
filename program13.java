package myprogram;

import java.util.Scanner;

public class program13 {

	//Function to calculate sum of digits of an integer number with user inputs
	static long getSum(long numbers) {
		long sum=0;
		while(numbers != 0) {
			sum=sum+(numbers%10);//we will exact last digit
			numbers=numbers/10;
			
		}
		return sum;
	}
	static void invoke_getSum() {
		Scanner read=new Scanner(System.in);
		long input=read.nextLong();
		long name=getSum(input);
		System.out.println(name);
	}
	public static void main(String[] args) {
		invoke_getSum();
	}
}
