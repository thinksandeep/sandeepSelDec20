package week1.day1;

public class mobile {
	
	String phoneBrand = "samsung";
	String phoneSize ="big";
	boolean isSmartPhone = true;
	long phNo = 9841386693L;
	String modelNumber = "S20 Plus";
	int phonePrice = 999;
	char simType = 'F';
	
	public void sendSMS() {
		System.out.println("message is sent");
	}
	public void makeCall() {
		System.out.println("call is made");
	}


public static void main (String[] args) {
	
mobile obj = new mobile ();

obj.sendSMS();
obj.makeCall();

System.out.println(obj.phoneBrand);

String model = obj.modelNumber;
System.out.println(model);

System.out.println(obj.phonePrice);

}
}