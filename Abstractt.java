package prog;

abstract class phonem{
	abstract void HS();
	abstract void TB();
}

class moto extends phonem{
	void HS()
	{
		System.out.println("Hello Moto");
		
	}
	void TB(){
		System.out.println("Upper Side");
	}
}
class vivo extends phonem{
	void HS()
	{
		System.out.println("Vivo On");
	}
	void TB(){
		System.out.println("Lower Side");
	}
}
class Abstractt{
	
	public static void main(String[] args) {
		phonem a= new moto();
		a.HS();
		a.TB();
		phonem b= new vivo();
		b.HS();
		b.TB();		
	}

}
