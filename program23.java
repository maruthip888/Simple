package myprogram;

public class program23 {
//Function to print binary valuesof various input like int,char	 and also perform shift operator
	static void printBinary(int number) {
		if(number<0) {
		return;
		}
		int countOfBits=Integer.BYTES * 8;
		//EX:Integer is 4 bytes,4*8=32 bites,left most bit is for the sign(positive or negative)
		//32 bits for the value
		int mask =1;
		mask = mask << (countOfBits -2);
		System.out.print("\nBinary form of number" +number+" ");
		while(mask>0) {
			int result =number & mask;
			if(result!=0)
				System.out.println("1");
			else
				System.out.println("0");
			
			mask=mask >> 1;
		}
	}
	static void invoke_printBinary() {
		printBinary(400);
	}
	public static void main(String[] args) {
	invoke_printBinary();
	}

}
