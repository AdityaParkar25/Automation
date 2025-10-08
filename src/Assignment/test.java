// Question 5: Write a Java Program to implement multiple inheritance

// Java DOES NOT support Multiple Inheritance using classes.

package Assignment;

import java.io.*;

// First Parent class
class Parent1 {
	void fun() {
		System.out.println("Parent1");
	}
}

//Second Parent class
class Parent2 {
	void fun() {
		System.out.println("Parent2");
	}
}

//Inheriting properties of Parent1 and Parent2
class test extends Parent1, Parent2 {

	public static void main(String[] args) {
		
		// creating instance of test
		test t = new test();
		t.fun();

	}

}
