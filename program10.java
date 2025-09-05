package myprogram;

public class program10 {
//Function to reverse a String
	static String reverseString(String input) {
		char[] inputArray=input.toCharArray(); //convert string into the character(char)
		int leftindex=0;
		int rightindex=input.length()-1;
		while(leftindex<rightindex){
			char temp=inputArray[leftindex];
			inputArray[leftindex]=inputArray[rightindex];
			inputArray[rightindex]=temp;
			leftindex++;
			rightindex--;
		}
		String output=new String(inputArray);//convert character(char) to string
		return output;
		
	}
	
static void invoke_reverseString() {
	String input1="coding is a skill to learn for IT";
	String output1=reverseString(input1);
System.out.println("Input is : "+input1+" And the output is : "+output1);
}
public static void main(String[] args) {
	invoke_reverseString();
}

}
							