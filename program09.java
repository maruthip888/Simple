package myprogram;

public class program09 {
	//Function to reverse a String
	static String reverseString(String input) {
		StringBuilder output = new StringBuilder();
		for (int index=input.length()-1;index>=0;index--){
			output.append(input.charAt(index));
		}
		return output.toString();
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
