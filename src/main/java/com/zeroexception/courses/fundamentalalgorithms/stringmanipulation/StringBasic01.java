package com.zeroexception.courses.fundamentalalgorithms.stringmanipulation;

/**
 * Solve basic problems using Java build-in functions manipulating String
 * This exercise aims to put following Java methods into action:
 * charAt(), indexOf(), length(), and substring(), trim()
 * replace()
 * split()
 * toLowerCase() and toUpperCase()
 * startsWith() and endsWith(),
 * equals() and equalsIgnoreCase()
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

		/**
		 * Given a paragraph of text, calculate how many sentences included in the paragraph.
		 ** Example: paragraph = "I have 2 pets, a cat and a dog. The cat's name is Milo. The dog's name is Ricky";
		 ** return should be 3.
		 *
		 * @param paragraph of text
		 * @return the number of sentences
		 * (Suggest: Using split function of String).
		 */

		static int sentenceCount(String paragraph) {
			if (paragraph != null && !paragraph.isEmpty()) {
				return paragraph.split("\\.").length;
			}
			else return 0;
		}

		/**
		 * Given a paragraph of text, which unfortunately contains bad writing style:
		 * error1: each sentence doesn't begin with a capital letter
		 * error2: there is space between commas and previous letter, like "2 pets , a cat "
		 * error3: there is no space between commas and the next letter, like "2 pets,a cat "
		 * error4: there is space between period and previous letter, like "a dog ."
		 * error5: there is more than one space between words, like "a     dog"
		 * Write code to correct the paragraph.
		 ** Example: paragraph = "i have 2 pets , a cat  and a dog. the cat's name is Milo . the dog's name is Ricky"
		 ** output = "I have 2 pets, a cat and a dog. The cat's name is Milo. The dog's name is Ricky"
		 *
		 * @param paragraph of wrong text
		 * @return corrected paragraph
		 * Suggest: using some of followings: split, replace, toUpperCase.
		 */
		static String correctParagraph(String paragraph) {

			String newText = paragraph.replaceAll("\\s{2,}+", " ");

			newText = newText.replaceAll("\\s+,", ",");
			newText = newText.replaceAll("\\s+\\.", ".");


			String firstLetter = newText.substring(0, 1).toUpperCase();
			newText = firstLetter + newText.substring(1);

			String[] sentences = newText.split("\\.");
			for(int i = 0; i < sentences.length; i++){
				String temp = sentences[i].trim();
				firstLetter = temp.substring(0, 1).toUpperCase();
				sentences[i] = firstLetter + temp.substring(1);
			}
			StringBuilder newParagraph = new StringBuilder(sentences[0]);
			for(int i = 1; i < sentences.length; i++){
				newParagraph.append(". ").append(sentences[i]);
			}
			newText = newParagraph.append(".").toString();

			return newText;
		}

  /**
   * Given an article and a keyword. Find how many times the key words appear in the articles
   * Example:
   * article = "Business Insider teamed up with Zillow's rental site, HotPads, to find the
   * median rent for a one-bedroom apartment in each of the 49 US metro areas with the largest
   * populations (as determined by Zillow). We also used Data USA to find the median household
   * income in each of these areas.
   *
   * The data was compiled using HotPad's Repeat Rent Index. Each of the one-bedroom apartments
   * analyzed in the study has been listed for rent on HotPads for longer than a month."
   * keyword = "one-bedroom".
   * Because the word "one-bedroom" appears twice in the paragraph, therefore:
   * countAppearances should return 2.
   * @param article: String. like a newspaper article
   * @param keyword: keyword to find in the articles
   * @return the number of appearances
   * Suggest: use method indexOf
   */


	static int countAppearances(String article, String keyword) {
		if(keyword.isEmpty()){
			return 0;
		}
		String newArticle = article.replace(keyword, "");
		return (article.length() - newArticle.length())/keyword.length();
	}


}
