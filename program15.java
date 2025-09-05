package myprogram;

public class program15 {
	//Function to print max and min value from an integer array	,printMaxMin
	static void printMinMax(int[] numbers) {
		if(numbers.length==0) {
			return;
			}
		int min=numbers[0];
		int max=numbers[0];
		for(int index=1;index<numbers.length;index++) {
			if(numbers[index]>max) {
				max=numbers[index];
			}
			if(numbers[index]<min)
				min=numbers[index];
		}
		  System.out.println("Maximum value: " + max);
	      System.out.println("Minimum value: " + min);
	}
	static void invoke_printMinMax()
	{
		int[] numbers= {10,72,85,10,65,-5,789,-48,-49};
		printMinMax(numbers);
	}
		public static void main(String[] args) {
			invoke_printMinMax();
	    }
	}

	
	
