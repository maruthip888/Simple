package myprogram;

public class program07 {
//Function to print ASCII Value of the String input
	static void PrintAscii(String input) {
	char character;
	for(int index=0;index<input.length();index++) {
		character=input.charAt(index);
		int ascii=character;
		System.out.println("ASCII Value of the char "+character+" is "+ascii);
	}
	}
	static void invoke_PrintAscii() {
		PrintAscii("1234567889656a");
	}
	public static void main(String[] args) {
		 invoke_PrintAscii();
	}
}

