package myprogram;

public class program24 {
	//Functionto remove a spaces from a String
	static String removeSpaces(String input) {
		StringBuilder result = new StringBuilder();
		for(int index=0;index<input.length();index++) {
			char oneChar=input.charAt(index);
			if(oneChar == ' ') 
			 	continue;
			result.append(oneChar);
		}
		return result.toString();
	}
	static void invoke_removeSpace() {
		String result="my name is maruthi";
		String remove=removeSpaces(result);
		System.out.println(remove);
	}

	public static void main(String[] args) {
		invoke_removeSpace();
	}

}
