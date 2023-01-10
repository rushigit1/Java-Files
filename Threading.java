package prog;

import java.util.jar.Attributes.Name;

class thread1 extends Thread{
	@Override
	public void run()
	{
		int i=0;
		while(i<100) {
		System.out.println("This is my Thread 1");
		i++;
		}
	}
}

class thread2 extends Thread{
	
	public thread2(String name){
		super(name);
	}
	@Override
	public void run()
	{
		int i=0;
		while(i<10) { 
		System.out.println("This is my Thread 2");
		i++;
		}
	}
}
class threadr1 implements Runnable{
	@Override
	public void run()
	{
		int i=0;
		while(i<100) {
		System.out.println("This is my Thread 1");
		i++;
		}
	}
}

class threadr2 implements Runnable{
	public threadr2(Runnable c, String name)
	{
		super(c,name);
	}
	@Override
	public void run()
	{
		
		int i=0;
		while(i<100) { 
		System.out.println("This is my Thread 2");
		i++;
		}
		
	}
}

public class Threading {

	public static void main(String[] args) {
		
		//by extending thread class
		/*
		thread1 a = new thread1();
		thread2 b = new thread2();
		a.start();
		b.start();
		*/
		//by implementing thread class interface		
		/*
		threadr1 bullet1= new threadr1();
		threadr2 bullet2= new threadr2();
		Thread gun1= new Thread(bullet1);
		Thread gun2= new Thread(bullet2);
		gun1.start();
		gun2.start();
		*/
		
		
		//constructors of thread 
		thread2 a= new thread2("Anu");
		a.start();
		System.out.println("This is my ID "+a.getId());
		thread2 b= new thread2("Deshmukh");
		b.start();
		System.out.println("This is my ID "+b.getId());
		
		threadr2 bullet3= new threadr2();
		Thread gun1 = new Thread(bullet3,"AD");
		gun1.start();
		
		
	}

}
