package com.zeroexception.courses.fundamentalalgorithms.stringmanipulation;

/**
 * Solve basic problems using Java build-in functions manipulating String
 */
public interface StringBasic01 {

		/**
		 * Palindrome is a String which give the same result by reading from left to right and from right to left.
		 * Example: "aabaa" is a palindrome.
		 * "mom" is a palindrome
		 * "radar" is a palindrome
		 * etc.
		 * Using charAt(int position) function of Java String to check if a input String is palindrome
		 *
		 */
		static boolean isPalindrome(String s) {
				int i = 0, j = s.length() - 1;
				while (i < j) {
						if (s.charAt(i) != s.charAt(j))
								return false;
						++i;
						--j;
				}
				return true;
		}


}
