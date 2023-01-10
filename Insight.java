class calci{
	double i;
	double j=Math.sqrt(i);
}
class Insight {
	
	public static void main(String[] args) {
		calci a= new calci();
		a.i=56;
		System.out.println("sqaure root of "+a.i+" is "+a.j);
	}

}
