package exam11;

public class OperationTest01 {

	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		int c = -1;
		int result1 = a+b;
		int result2 = a-b;
		int result3 = a*b;
		int result4 = a/b;
		int result5 = a%b;
		int result6 = a%c;
		int result7 = b%c;
		
		System.out.printf("%d %d %d %d %d %d %d",result1, result2, result3, result4, result5, result6, result7);
	}

}
