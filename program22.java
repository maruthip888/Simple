package myprogram;

public class program22 {
	//Function to get count of words in the String getCountOfString
		//Ex:-what is your name ,space=
		static int getCountOfString(String input) {
			int countOfWords=0;
			if(input ==null) {
				return countOfWords;
			}
			if(input.length()==0) {
				return countOfWords;
			}
			for(int index=0;index<input.length();index++) {
				char character=input.charAt(index);
				if(character == ' ' ||character=='\t'||character=='\n'||character==' ')
					countOfWords++;
			}
			//Increment the last word 
			//countOfWords=countOfWords+1;
			return countOfWords;
		}
		static void invoke_getCountOfString() {
			String name="mama  mama mama";
			int result=getCountOfString(name);
			System.out.println("The Number of words is : "+result);
		}
		public static void main(String[] args) {
			invoke_getCountOfString();
			
		}

}
