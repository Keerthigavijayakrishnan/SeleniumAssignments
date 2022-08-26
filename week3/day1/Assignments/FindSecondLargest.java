package collectionsprogram;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//       output= 7;

		
		 // Pseudo Code: 
		 //a) Create a empty Set Using TreeSet
		 Set <Integer> set = new TreeSet<Integer>();
		 
		 // b) Declare for loop iterator from 0 to data.length and add into Set 
		  int length = set.size();
		 int length1 = data.length;
		
		for(int i=0; i<=length1; i++) {
			
		System.out.println(i);
	}
		
		for (int eachNumber: data) {
			System.out.println(set.add(eachNumber));
			 
		 }
		
	
		 // c) converted Set into List
		 List<Integer> list = new ArrayList<Integer>(set);
		 
		 // d) Print the second last element from List
		   Collections.sort(list);
	         System.out.println(list);
	          int secondlargestNumber = list.get(list.size()-2);
	 
		 System.out.println("SecondLargestNumber: "+secondlargestNumber);
		 
		 
	



	}}
