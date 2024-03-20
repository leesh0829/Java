package ex08;

public class Test01 {
	private static int a;
	static int getA() {
		return a;
	}
	
	private int b;
	int getB() {
		return b;
	}
	
	int c() {
		return getA();
	}
	
	//static int d() {
		//return getB();
	//}
}
