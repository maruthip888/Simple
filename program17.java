package myprogram;

public class program17 {
	//Function to merge two arrays and return combined output in first array
	
		//Assume that master array has memry allocated to have all elements from data
	static void mergeArrays(int[] masterArray,int[] data) {
		int countData =data.length;
		int startIndex=masterArray.length - countData;
		for(int dataIndex =0;startIndex<masterArray.length;startIndex++,dataIndex++) {
			masterArray[startIndex]=data[dataIndex];
		}
	}
	static void printArray(int[] numbers) {
		for(int index=0; index<numbers.length;index++) {
			System.out.println(numbers[index]);
		}
	}
	static void invoke_mergeArray() {
		int[] masterArray = {1,2,3,4,5,6,7,8,0};
		int[] data= {10,11};
		mergeArrays(masterArray,data);
		printArray(masterArray);
	}
	public static void main(String[] args) {
		invoke_mergeArray();
	}
}
