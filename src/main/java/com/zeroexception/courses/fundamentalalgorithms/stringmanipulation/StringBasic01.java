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
		static boolean isPalindrome(String input) {
			for (int i = 0; i < input.length(); i++){
					int len = input.length() - 1 - i;
					if(input.charAt(i) != input.charAt(len)){
							return false;
					}
			}
			return true;
		}


}
