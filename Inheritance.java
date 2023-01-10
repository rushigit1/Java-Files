package prog;
class twoD
{
	int i;
	int j;
	twoD(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	int area()
	{
		return i*j;
	}
}
class Rectangle extends twoD// Hierachical Inheritance
{
	Rectangle(int a, int b){
		super(a,b);
	}
	int area()
	{
		return i*j;
	}
}
class Square extends Rectangle// multi level Inheritance
{
	Square(int a){
		super(a,a);
	}
	int area()
	{
		return i*i;
	}
}

class Triangle extends twoD // Hierachical Inheritance
{
	int k;
	static boolean Isright=false;
	Triangle(int a,int b, int c){
		super(a,b);
		k=c;
	}
	int area()
	{
		if(Isright)
			return super.area()/2;
		else {
		int s=(i+j+k)/2;
		return (int)Math.sqrt(s*(s-i)*(s-j)*(s-k));
		}
	}
}


class threeD extends twoD// Single  Inheritance
{
	int k;
	int i;
	threeD(int i, int j, int k)
	{
		super(i,j);// calling parent class constructor
		this.i=super.i;//differentiating super i from another i 
		this.k=k;// 
	}
	int volume()
	{
		return i*j*k;
	}
}
public class Inheritance {
	public static void main(String[] args)
	{
		// Single Inheritance
		twoD a= new twoD(5,12);
		System.out.println("Area of 2D figure " +a.area());
		
		threeD b= new threeD(5,12,13);
		System.out.println("Volume of 3D object " +b.volume());
		
		
		//hierachical inheritance
		Rectangle l = new Rectangle(5,4);
		System.out.println("Area of Rectangle " +l.area());
		
		Triangle m = new Triangle(5,12,13);
		m.Isright=true;
		System.out.println("Area of Triangle " +m.area());
		Triangle p = new Triangle(6,7,8);
		System.out.println("Area of Triangle " +p.area());
		
		// Multi level inheritance
		Square n= new Square(6);
		System.out.println("Area of Square " +n.area());
		
		
		/*
		 *  Single Inheritance
		 *  threeD is derived from twoD
		 *  
		 *   Hierachical Inheritance
		 *   Rectangle is derived from twoD
		 *   triangle is derived from twoD
		 *   
		 *   Multi Level Inheritance
		 *   Rectangle is derived from twoD
		 *   Sqaure is derived from Rectangle
		 *   
		 *   
		 */
		
		
		
	}
	
}
	

