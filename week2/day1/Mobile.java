package week2.day1;

public class Mobile {

	public void makeCall(String mobileModel,float mobileWeight) {
		System.out.println("Mobile Model- "+mobileModel+ " ; Mobile Weight -"+mobileWeight);
	}
	public void sendMsg(boolean isFullCharged,int mobileCost) {
		System.out.println("Full Charged- "+isFullCharged+ " ; Mobile Cost -"+mobileCost);
	}	
	public static void main(String[] args) {
		
		Mobile mob=new Mobile();
		mob.makeCall("Samsung", 150.0f);
		mob.sendMsg(true, 500);
	}
}
