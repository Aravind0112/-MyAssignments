package week3.day2;

import java.util.Arrays;

public class LearnStringMethod {

	public static void main(String[] args) {

		String text = "Testleaf";
		//to print the text in lower case
		//		String lowerCase = text.toLowerCase();
		//		System.out.println(lowerCase);
		//		//to print the text in upper case
		//		String upperCase = text.toUpperCase();
		//		System.out.println(upperCase);
		//		//To print length of the string
		//		int length = text.length();
		//		System.out.println(length);

		//		//to print Each character from a text
		char[] array = text.toCharArray();
		//		for(int i=0;i<text.length();i++) {
		//			System.out.println(array[i]);
		//		}

		//reverse the string

		//		for(int i=text.length()-1;i>=0;i--) {
		//			System.out.println(array[i]);
		//		}

		//Splitting an array using toString method
		//		System.out.println("Splitting using toString method");
		//		String text1="I like Biriyani";
		//		String[] split = text1.split(" ");
		//		System.out.println(Arrays.toString(split));
		//		
		//		System.out.println("Splitting using for loop");
		//		for(int i=0;i<split.length;i++){
		//			System.out.println(split[i]);
		//		}
		//		
		//		
		//		// replace all 
		//		System.out.println("Replacing numbers ");
		//		String email = "testleaf1234@gmail.com";
		////		String replaceAll = email.replaceAll("[0-9]", "");
		//		
		//		String replaceAll = email.replaceAll("[a-z]", "");
		//		System.out.println(replaceAll);
		//		
		//		//charAt
		//		
		//		String text3 = "Test";
		//		char charAt = text3.charAt(1);
		//		System.out.println(charAt);

		String text5="I like chicken Biriyani";
		String[] split = text5.split(" ");
		for(int i=0;i<split.length;i++) {
			if(i%2!=0) {
				char[] charArray = split[i].toCharArray();
				for(int j=charArray.length-1;j>=0;j--){				
					System.out.print(charArray[j]);
				}
			}
			else {
				System.out.print(" ");
				System.out.print(split[i]+" ");
			}

		}

	}

}
