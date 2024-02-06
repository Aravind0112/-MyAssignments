package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		
		//1.Arithmetic Operation
		System.out.println("Arithmetic Operator");
		int a=10;
		int b=5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); //Quotient
		System.out.println(a%b); //Remainder
		
		//2.Assignment Operator
		System.out.println("Assignment Operator");
		//int result=100;
		a=a+5;
		System.out.println(a);
		a+=5;  //short hand assignment operator
		System.out.println(a);
		
		//3.Comparison Operator =>Return type Boolean
		System.out.println("Comparison Operator");
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>b);
		System.out.println(a>=b);

		//4.Logical Operator => To combine more than 2 boolean expression
		System.out.println("Logical Operator");
		System.out.println((a==b)&&(a>b)); //AND Operator(&&) => When both the condition true then result true
		System.out.println((a==b)||(a>b)); //OR Operator (||) => When any of the condition true then result true
		boolean flag= false;
		System.out.println(!flag); //NOT Operator(!)
		
		//5.Unary Operator 
		System.out.println("Unary Operator");
		int i=10;
//		System.out.println(i++); //post increment
//		System.out.println(i);
//		//System.out.println(++i); //pre increment
		System.out.println(i--); //post increment
		System.out.println(i);
		//System.out.println(--i); //pre increment
	}

}
