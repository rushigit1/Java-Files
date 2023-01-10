package prog;

//Same package t is not accessible because its private
public class Access_Modifier {

	public static void main(String[] args) {
		using k = new using();
		System.out.println(k.p);
		System.out.println(k.q);
		System.out.println(k.r);
		//System.out.println(k.t);

	}

}
