// Question 2: Write a Java Program to find prime numbers between 1 to 100.

package Assignment;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime numbers between 1 and 100:");
		
		for (int number = 2; number <= 100; number++) {
			if (isPrime(number)) {
				System.out.println(number + " ");
			}
		}

	}
	
	//Method to check if the number is a prime number
	public static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

}
