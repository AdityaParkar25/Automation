// Question 3: Write a Java Program to handle given uncheck exception
//			   a) ArrayIndexOutOfBound b) NullPointerException

package Assignment;

public class HandleException {

	public static void main(String[] args) {
		
		/* a) ArrayIndexOutOfBound
		int a[] = {1,2,3,4,5,6};
		
		try {
			System.out.println("Accessing index 8: " + a[8]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught: " + e);
			System.out.println("make sure the index is within the valid range (0 to " + (a.length - 1) + ").");
		}
		System.out.println("Program continues after exception handling."); */
		
		// b) NullPointerException
		 String str = null;
		 
		 try {
			 int length = str.length();
			 System.out.println("Length of the string is: " + length);
		 } catch (NullPointerException e) {
			 System.out.println("Caught a NullPointerException");
			 System.out.println("Error: " + e.getMessage());
		 }
		 
		 System.out.println("Program continues after exception handling.");
		
	}

}


