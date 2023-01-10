package prog;

class Circle{
	int p;
	int q;
	
	Circle(){
		p=11;
		q=22;
	}
	Circle(int a, int b)
	{
		p=a;
		q=b;
	}
	Circle(int p)
	{
		this.p=p;
		this.q=p;
	}
	Circle(double p)
	{
		this((int)p,(int)p);//calling constructor by making it in int
	}
	Circle(Circle m)//this is also used as call by reference 
	{
		p=m.p++;
		q=m.q++;
	}
	
}
public class Encapsultion {
	int y;
	int x;
	void dis()
	{
		y=10;
		x=14;
	}
	void dis(int a, int b)
	{
		y=a;
		x=b;
	}
	void dis(Encapsultion c)
	{
		y=c.x;
		x=c.y;
	}
	void dis(double a, double b)
	{
		this.dis((int)a,(int)b);
	}
	public static void main(String[] args) {
		System.out.println("Methods");
		Encapsultion a = new Encapsultion();
		a.dis();
		System.out.println(a.x+a.y);
		Encapsultion b = new Encapsultion();
		b.dis(12,13);
		System.out.println(b.x+b.y);
		Encapsultion e = new Encapsultion();
		e.dis(a);
		System.out.println(e.x+e.y);
		Encapsultion h = new Encapsultion();
		h.dis(13.2,14.2);
		System.out.println(h.x+h.y);
		System.out.println("\nConstructor");
		Circle c = new Circle();
		System.out.println(c.p+c.q);
		Circle d = new Circle(33,44);
		System.out.println(d.p+d.q);
		Circle f = new Circle(15);
		System.out.println(f.p+f.q);
		Circle g = new Circle(17.1);
		System.out.println(g.p+g.q);
		Circle i = new Circle(c);// object passed
		System.out.println(i.p+i.q);
		System.out.println(c.p+c.q);// call by reference print values changed of object c 
		
		
		
	}

}
