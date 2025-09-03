package myprogram;

public class Program01 {
	static int getresult(int number1,int number2) {
		int sum = number1+number2;
		return sum;
		
	}
	
	static void getAns() {
		int result =getresult(40,522);
		System.out.println("The sum of the two numbers are:" +result);
	}
	public static void main(String[] args) {
		getAns();
	}

}
