package prog;
class using
{
	public int p=20;
	protected int q=30;
	int r=40;
	private int t=50;
	void meth()
	{
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(t);
	}
}
public class AccessModifier2 {

	public static void main(String[] args) {
		using k = new using();
		//k.meth();
		System.out.println(k.p);
		System.out.println(k.q);
		System.out.println(k.r);
		//System.out.println(k.t);  //t is accessible in same class only 
	}

}
