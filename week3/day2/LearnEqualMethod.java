package week3.day2;

public class LearnEqualMethod {

	public static void main(String[] args) {
		
		String text1="TestLeaf";
		String text2="TestLeaf";
		
		if(text1==text2) {
			System.out.println("Both text are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
		
		String str1=new String("TestLeaf");
		String str2=new String("TestLeaf");
		
		if(str1==str2) {
			System.out.println("By using new Keyword "+ "Both are equal");
		}
		else {
			System.out.println("By using new Keyword "+ "Not Equal");
		}

	}

}
