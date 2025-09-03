package myprogram;

public class Program02 {
	//This code doesn't work because java is using pass by value
	static void swap(int number1,int number2) {
		int temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("nuber1" +number1 + "number2" +number2);
		
	}
	// here Java using a pass by reference examples using array's
	static void swap_v2(int[] numbers) {
		int temp=numbers[0];
		numbers[0]=numbers[1];
		numbers[1]=temp;
	}
	
	
	static void invoke_swap() {
		int input1=10;
		int input2=80;
		System.out.println("Input1:" +input1+"Input2:"+input2);
		swap(input1,input2);
		System.out.println("Input1:" +input1+"Input2:"+input2);
		
		
		int[] input3 = {10,80};
		swap_v2(input3);
		System.out.println("Input1:" +input3[0]+"Input2:"+input3[1]);
	}
	public static void main(String[] args) {
		invoke_swap();
		

	}

}
