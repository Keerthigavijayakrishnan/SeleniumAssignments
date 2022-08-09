package week1.day2.assignments.mandatory;

public class FindIntersection {

	public static void main (String[] args) {
	// * Pseudo Code
	
	// * a) Declare An array for {3,2,11,4,6,7};	 
	
		int[] array1 = {3,2,11,4,6,7};
	
	// * b) Declare another array for {1,2,8,4,9,7};
	int[] array2 = {1,2,8,4,9,7};
	
	// * c) Declare for loop iterator from 0 to array length
	
	int length1 = array1.length;
	int i;
	int length2 = array2.length;
	int j;
	for(i=0; i<length1; i++) {
	
	// * d) Declare a nested for another array from 0 to array length
		
		for(j=0; j<length2; j++) {
			
		
	// * e) Compare Both the arrays using a condition statement
	 
			if(array1[i]==array2[j]) {
				
	// *  f) Print the first array (shoud match item in both arrays)

	
	System.out.println("the first array- match item in both arrays" +array1[i]);
		}
		}
	}
	
		
}
	
}
