package leetCode;

/*
 ==========================================================
 Author : Hyogi Jung(hyogij@gmail.com)
 Date : 2015.09.30
 Question Number : 120
 Link : https://leetcode.com/problems/factorial-trailing-zeroes/
 ==========================================================
 */

public class TrailingZeroes {
	/*
	 * Given an integer n, return the number of trailing zeroes in n!.
	 * 
	 * Note: Your solution should be in logarithmic time complexity.
	 */
	public static void main(String[] args) {
		int num = 20;
		System.out.println("trailingZeroes " + trailingZeroes(num));
	}

	public static int trailingZeroes(int n) {
		// Zero is made by multiplying of two and five. So we can expected
		// result through the number of twos and fives.
		int twos = 0, fives = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				twos += getNumberOfFactor(i, 2);
			}
			if (i % 5 == 0) {
				fives += getNumberOfFactor(i, 5);
			}
		}

		// Return the minimum number of two values
		return Math.min(twos, fives);
	}

	// Get the number of given factor of N
	public static int getNumberOfFactor(int n, int factor) {
		int count = 0;
		while (n % factor == 0) {
			n /= factor;
			count++;
		}
		return count;
	}
}
