package prog;
class Circle2{
	int n;
	Circle2(int p)
	{
		n=p;
	}
	Circle2 change(int k)
	{
		Circle2 t = new Circle2(n);
		t.n=t.n*k;
		return t;
	}
	Circle2 bigger(Circle2 p)
	{
		if(p.n > n) return p;
		else return this;
	}
	static Circle2 bigger(Circle2 m, Circle2 p)
	{
		if(m.n > p.n) return m;
		else return p;
	}
}

public class Return_Object {

	public static void main(String[] args) {
		Circle2 c = new Circle2(8);
		Circle2 d;
		d=c.change(2);// object is returned to same object 
		c=c.change(5);// object is returned to other object
		System.out.println(d.n + "\n" +c.n);
		
		
		// Static and instance method differ
		Circle2 p = new Circle2(4);
		Circle2 q = new Circle2(5);
		Circle2 r= p.bigger(q); //object need to be created
		Circle2 s= Circle2.bigger(p,q);//object no need to be created directly called class circle 
		
		System.out.println(r.n+" "+ s.n);
		
		
		
	}

}
