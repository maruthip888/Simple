package myprogram;

public class Program04 {
 //Function isNumber to retur true if it is a digit
	static boolean isNumber(String input) {
		boolean result=true;
		for(int index=0;index<input.length();index++) {
			char character=input.charAt(index);
			if(character<'0' ||character>'9') {
				result=false;
				break;
			}
		}
		return result;
	}
	static void invoke_innumber() {
		boolean result=isNumber("12351joj8662");
		
		if(result) {
			System.out.println("It is a proper number");
			
		}
		else {
			System.out.println("It is a invalid number");
		}
	}
	public static void main(String[] args) {
		 invoke_innumber();

	}

}
