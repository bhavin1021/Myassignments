package week1.day2;

public class Mobile {
	
	public void sendSms()
	{
		System.out.println("Phone Oppo");
	}
	
	public long makeCall(long phno)
	{
		return phno; 
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Mobile Obj1 = new Mobile();
		Obj1.sendSms();
		
		  long makeCall = Obj1.makeCall(90111);
		System.out.println(makeCall);

	}
	
}
