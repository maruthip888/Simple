package myprogram;

public class program18 {
 //Function get second largest element in an integer array without using the sort function
	static int issecondLargest(int[] number) {
		if(number.length ==0)
		{
			return -1;
		}
		int largest=number[0];
		int secondlargest=number[0];
		for(int index=0;index<number.length;index++) {
			if(number[index]>largest) {
				secondlargest=largest;
				largest=number[index];
			}
			else if(number[index]>secondlargest) {
				secondlargest=number[index];
			}
		}
		return secondlargest;
	}
	static void invoke_secondLargest() {
		int[] input= {10,20,30,40,50,60,70,80,90,700,8000,750,92200};
		int result=issecondLargest(input);
		System.out.println(result);
	}
	public static void main(String[] args) {
		invoke_secondLargest();
	}
}
