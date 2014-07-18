package com.javacertificationorbust.examprep;

public class ExceptionInFinally {
	
/*
 * This example demonstrates that when an exception is thrown from within a finally 
 * block, an exception thrown in the try block is ignored.	
 */
	
	public static void main(String[] args) throws Exception {
		try {
			throw new Exception("try");
		} finally {
			throw new Exception("finally");
		}
	}
}
