package prog;

class cellphone
{
	void makecall()
	{
		System.out.println("Calling AD");
	}
	void switchoff()
	{
		System.out.println("Switching off");
	}
	void SnakeGame()
	{
		System.out.println("Opening Game\n-------Highest Score is 123 ");
	}
}



interface GPS{
	void findloc();
	default void coordinates(double a, double b) // default method
	{
		System.out.println("Coordinates are "+a+" "+b);
	}
	
}
interface recordVideo
{
	void startrecord();
	void Saverecord();
}
interface camera extends recordVideo{//inheritance in interface 
	void capture();
	void zoom(int z);
	
}

interface media{
	void play_song();
	void play_video();
	}

class smartphone extends cellphone implements GPS, camera, media 
{
	public void findloc()
	{
		System.out.println("location is Pune");
	}
	public void startrecord()
	{
		System.out.println("recording video");
	}
	public void Saverecord()
	{
		System.out.println("Saving video");
	}
	public void capture()
	{
		System.out.println("Capturing a photo");
	}
	public void zoom(int z)
	{
		System.out.printf("Zooming upto %dx \n",z);
	}
	public void play_song()
	{
		System.out.println("Playing song...");
	}
	public void play_video()
	{
		System.out.println("Playing Video");
	}
}




public class interfacee {

	public static void main(String[] args) {
		camera a = new smartphone();
		a.zoom(2);
		smartphone b = new smartphone();
		b.makecall();
		b.SnakeGame();
		b.findloc();
		b.coordinates(12.566555, 45.556225);// default method
		b.startrecord();
		b.Saverecord();// inheritance in interface 
		b.capture();
		b.zoom(4);
		b.play_song();
		b.play_video();
		b.switchoff();

	}

}
