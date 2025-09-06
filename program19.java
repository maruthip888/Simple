package myprogram;

public class program19 {
	//Function to print unique elements in an integer Array
	static  void printUniqueElement(int[] numbers) {
		for(int readIndex=0;readIndex<numbers.length;readIndex++) {
			boolean isDuplicate=false;
			//Check if the number has any duplicates in the array
			for(int compareIndex=0;compareIndex<numbers.length;compareIndex++) {
				if(readIndex == compareIndex)
				continue;
				if(numbers[readIndex]==numbers[compareIndex]) {
				isDuplicate=true;
				break;
					}
				}

			if(!isDuplicate)
				System.out.println(numbers[readIndex]);
			}
			}
	
	static void invoke_printUniqueElement() {
		int[] input= {1,2,3,1};
		printUniqueElement(input);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invoke_printUniqueElement();
	}

}
