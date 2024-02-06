package week2.day2;

public class Calculator {
	
	int sum;  									//Global variable => Can be accessed anywhere in the class	
	public void addition(int a, int b) { 		//Local variable => Only accessible within the method
		int sum = a+b;
		System.out.println(sum);
//		System.out.println(a+b);
	}
	private void sub(int a,int b) {
		System.out.println(a-b);
	}
	protected float mul(float a,float b) {
		float result=a*b;
		return result;
	}
	void div(double a,double b) {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		
		Calculator cal=new Calculator();		// new => will allocate memory for the new  //Calculator(); =>is a constructor to initialize cal obj
		cal.addition(6, 2);
		cal.sub(6, 2);
		float output = cal.mul(2.3f, 3.2f);//ctrl+2+l    
	}

}

