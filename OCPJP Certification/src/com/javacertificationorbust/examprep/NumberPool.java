package com.javacertificationorbust.examprep;

/*
 * This example is to demonstrate that java keeps a pool of numerical values in the range of
 * -128 to 127.  This appears to be similar to the String pool. <@code == > comparisons of 
 * numerically equal values will return true for values in the above range, but will return 
 * false for values outside of that range.  Java is simply "reusing" these "common" numbers 
 * for efficiency.
 */
public class NumberPool {
	public static void main(String[] args) {
		int min = -130;
		int max = 130;
		for (int i = min; i <= max; i++) {
			Integer i1 = i;
			Integer i2 = i;
			System.out.printf("%d and %d are equal: %s\n", i1, i2, (i1 == i2)? "YES!":"NO! ... WTF!?!?");
		}
	}
}