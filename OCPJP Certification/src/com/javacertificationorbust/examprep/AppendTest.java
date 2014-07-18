package com.javacertificationorbust.examprep;

public class AppendTest {

/*
 * This example demonstrates the use of StringBuilder's (and StringBuffer's) append() method.
 * The implementation is trivial, but the point to be made is that these classes are mutable.
 * This is in contrast to String, which is immutable.  The append() method directly modifies 
 * the object it is called on.	
 */
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World!");
		System.out.println(sb);
	}
}
