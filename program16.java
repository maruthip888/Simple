package myprogram;

public class program16 {
	//Function to search in a sorted array
	static boolean binarySearch(int[] number, int key) {
		boolean isFound=false;
		int leftindex=0;
		int rightindex=number.length-1; 
		int midindex=(rightindex-leftindex)/2;
		while(leftindex<rightindex) {
			if(key ==number[midindex]) {
				isFound=true;
				break;
			}
			else if(key > number[midindex]) {
				leftindex=midindex+1;
			}
			else if(key < number[midindex]) {
				rightindex=rightindex-1;
			}
			midindex=leftindex+(rightindex-leftindex)/2;
			}
	return isFound;
		
	}
	static void invoke_binarySearch() {
		int[] input= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int key=7;
		boolean result=binarySearch(input,key);
		if(result) {
			System.out.println("Number is found");
		}
		else {
			System.out.println("Number is Not found");
		}
	}
	public static void main(String[] args) {
		invoke_binarySearch();
	}
}
