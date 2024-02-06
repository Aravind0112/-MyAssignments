package week1.day2;

public class LearnDataType {

	public static void main(String[] args) {

		//Datatype Variablename = value; (Syntax)

		//bye,short,int,long can be used for whole numbers
		short noWheels = 4;

		//float & double for decimals =>float(32 bit) upto 5 digit , double(64 bit)
		//float mileage =18.7f;
		double mileage = 15.5;

		//char => single character 'S' , Collection of character => String "collection"
		char logo = 'S';
		String name = "Swift";

		//Boolean => True or False
		Boolean isFilled = true ;

		//print the value based on variable name
		System.out.println(name);
		System.out.println(noWheels);
		System.out.println(mileage);
		System.out.println(isFilled);
		System.out.println(logo);
		//System.out.println("Carname="+name+" "+" Mileage="+mileage+" "+"No.of Wheels"+noWheels);
	}

}
