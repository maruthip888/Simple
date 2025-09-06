package myprogram;

public class program20 {
 //Function to print intersection or common elements of the two arrays 
	static void printCommonElements(int[] input1,int[] input2) {
		for(int input1Index=0;input1Index<input1.length;input1Index++) {
			boolean isFound=false;
			for(int input2Index=0;input2Index<input2.length;input2Index++) {
				if(input1[input1Index]==input2[input2Index]){
				isFound=true;
				break;
				}
			}
			if(isFound)
				System.out.println(input1[input1Index]);
			}
		}
	static void invoke_printCommonElements() {
		int[] input1= {1,2,3,4,5,6,7,8,9,10};
		int[] input2= {2,4,6,8,10};
		printCommonElements(input1,input2);
	}
	public static void main(String[] args) {
		invoke_printCommonElements();

	}

}
