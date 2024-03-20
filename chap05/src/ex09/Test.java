package ex09;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D();
		
		A a = d;
		a.ma();
		
		System.out.println();
		
		B b = d;
		b.mb();
		
		System.out.println();
		
		C c = d;
		c.mc();
		
		System.out.println();
		
		d.ma();
		d.mb();
		d.mc();
		d.md();
	}

}
