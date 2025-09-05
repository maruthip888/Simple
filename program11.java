package myprogram;

public class program11 {
	//Function for a sum of the integer numbers
	static int getSum(int[] numbers) {
		int sum=0;
		for(int index=0; index<numbers.length;index++) {
			sum=sum+numbers[index];
		}
		return sum;
	}
	static void invoke_getSum() {
		int[] input= {1,2,5,10,15,20};
		int name=getSum(input);
		System.out.println(name);
	}
	public static void main(String[] args) {
	
		invoke_getSum();
	}

}
