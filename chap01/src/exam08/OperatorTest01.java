package exam08;
//전위 증감 연산자, 후위 증감 연산자
public class OperatorTest01 {

	public static void main(String[] args) {
		int x = 10;
		int y = 15;
		//System.out.println("x++ = " + (x++));
		System.out.println("x++ = " + (++x));
		
		int z = x + y;
		
		System.out.println("z ="+ z);
		
		int w = ++x + y;
		System.out.println("w ="+ w);
		
		int t = x++ + y;
		System.out.println("t ="+ t);
		System.out.println("x ="+ x);

	}

}
