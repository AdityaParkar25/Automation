// Question 4: Write a Java Program to sort the ArrayList in Ascending order

package Assignment;

import java.util.ArrayList;
import java.util.Collections;


public class SortArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(41);
		numbers.add(17);
		numbers.add(5);
		numbers.add(25);
		numbers.add(4);
		numbers.add(9);
		
		System.out.println("Original ArrayList: " + numbers);
		
		// Sorting the Arraylist in ascending order
		Collections.sort(numbers);
		
		System.out.println("Sorted ArrayList (Ascending): " + numbers);

	}

}
