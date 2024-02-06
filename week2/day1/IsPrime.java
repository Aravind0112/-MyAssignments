package week2.day1;

public class IsPrime {

	public static void main(String[] args) {
		int num = 10;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
				System.out.println("num is not prime");
			else
				System.out.println("num is prime");
			break;
		}

	}

}
