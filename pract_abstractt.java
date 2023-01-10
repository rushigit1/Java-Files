package practice;


abstract class Telephone
{
	abstract void ring();
	abstract void lift();
	abstract void disconnect();
	
}

class SmartTelephone extends Telephone
{
	void ring()
	{
		System.out.println("ringing");
	}
	void lift()
	{
		System.out.println("Accepted Call");
	}
	void disconnect()
	{
		System.out.println("call disconnected");
	}
	void openCamera()
	{
		System.out.println("opening camera");
	}
}

public class pract_abstractt {

	public static void main(String[] args) {
		Telephone t= new SmartTelephone();
		t.lift();
		t.ring();
		t.disconnect();
		SmartTelephone a= new SmartTelephone();
		a.lift();
		a.ring();
		a.disconnect();
		a.openCamera();
		
		//here we demmonstrate polymorphism 
		// it exists in Telephone and also as smarttelephone

	}

}
