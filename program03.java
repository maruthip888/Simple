package myprogram;

public class program03 {
	//Function isEven to return true if number is even otherwise false
	static boolean iseven(int number) {
	if(number % 2==0) {
			System.out.println("Number is even "+number);
			return true;
			}
		else {
				System.out.println("Number is odd" +number);
				return false;
			}
	}
	
	
	static void invoke_even() {
 iseven(12);
  iseven(11);
	}
public static void main(String[] args) {
	invoke_even();
	//iseven(4);
}
}
