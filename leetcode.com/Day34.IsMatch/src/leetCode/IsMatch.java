package leetCode;

/*
 ==========================================================
 Author : Hyogi Jung(hyogij@gmail.com)
 Date : 2015.10.06
 Question Number : 135
 Link : https://leetcode.com/problems/wildcard-matching/
 ==========================================================
 */

public class IsMatch {
	/*
	 * Implement wildcard pattern matching with support for '?' and '*'.
	 * 
	 * '?' Matches any single character. 
	 * '*' Matches any sequence of characters(including the empty sequence).
	 * 
	 * The matching should cover the entire input string (not partial).
	 * 
	 * The function prototype should be: bool isMatch(const char *s, const char
	 * *p)
	 * 
	 * Some examples: 
	 * isMatch("aa","a") �� false 
	 * isMatch("aa","aa") �� true
	 * isMatch("aaa","aa") �� false 
	 * isMatch("aa", "*") �� true 
	 * isMatch("aa", "a*") �� true 
	 * isMatch("ab", "?*") �� true 
	 * isMatch("aab", "c*a*b") �� false
	 */
	public static void main(String[] args) {
		System.out.println("isMatch " + isMatch("aa","a"));
		System.out.println("isMatch " + isMatch("aa","aa"));
		System.out.println("isMatch " + isMatch("aab", "c*a*b"));
		System.out.println("isMatch " + isMatch("ab", "?*"));
		System.out.println("isMatch " + isMatch("aa", "*"));
	}
	
	public static boolean isMatch(String s, String p) {
		return true;
	}
}
