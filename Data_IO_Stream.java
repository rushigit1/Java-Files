package prog;

import java.io.*;

public class Data_IO_Stream {

	public static void main(String[] args){
		Float pm = new Float(0);
		Float rt = new Float(0);
		
		try {
		DataInputStream yd =new DataInputStream(System.in);
		String temp;
		System.out.flush();
		temp=yd.readLine();
		pm =Float.valueOf(temp);
		
		System.out.println("enter rate");
		System.out.flush();
		temp=yd.readLine();
		rt =Float.valueOf(temp);
		System.out.println(pm * rt);
		}
		catch(Exception ex)
		{}
		
		
		
		
		
		
		

	}

}
