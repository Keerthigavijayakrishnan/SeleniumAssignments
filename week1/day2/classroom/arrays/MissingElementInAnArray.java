package week1.day2.classroom.arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	
		Arrays.sort(arr);

		// loop through the array (start i from arr[0] till the length of the array)
			
			int length1 = arr.length;
		int i;
		
		 for(i=arr[0]; i<length1; i++) {

			// check if the iterator variable is not equal to the array values respectively
			
			  if(i!=arr[i]) {
				  
				// print the number
				
				   System.out.println(arr[i]);
				  
				// once printed break the iteration
				
				 break;
			 }
		 }

	}

}
