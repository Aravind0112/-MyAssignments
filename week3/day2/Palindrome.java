package week3.day2;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {

		String text="madam";
		String text1="";
		for(int i =text.length()-1;i>=0;--i) {
			text1 = text1 + text.charAt(i);
//			System.out.println(text1);
		}
//		System.out.println(text1);
		if(text.equals(text1)) {
			System.out.println("Its a Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}

	}

}
