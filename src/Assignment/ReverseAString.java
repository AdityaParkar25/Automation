//Question 1: Write a Java program to reverse a string with and without reverse() function.

package Assignment;

public class ReverseAString {

	public static void main(String[] args) {
		
		String str = "aditya";
		
		// --> Using reverse()
		
		/*StringBuilder s = new StringBuilder(str);
		
		System.out.println("Actual string: "+ s);
		System.out.println("Reverse string: "+ s.reverse()); */
		
		// --> Without using reverse()
		
		for (int i = 5; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
	}

}
