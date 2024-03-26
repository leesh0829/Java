package exam04;
// printf문의 다양한 형식 문자열을 사용하여 출력하기
public class Test03 {

	public static void main(String[] args) {
		int x1 = 123;
		int x2 = 120_000;
		int x3 = -256;
		int x4 = 75;
		double d1 = 123.12365678910178;
		String str1 = "강아지";
		char c1 = '가';
		
		System.out.printf("x1 = %d\n", x1); //괄호 안 공백 비 허용
		System.out.printf("x1 = %6d\n", x1);
		System.out.printf("x1 = %06d\n", x1);
		System.out.printf("x1 = %-6d\n", x1);
		System.out.printf("%-6d %-6d\n", x1, x1);
		System.out.println(); //괄호 안에 공백 허용
		
		System.out.printf("x2 = %d\n", x2);
		System.out.printf("x2 = %,d\n", x2); //천 단위 마다 ,로 구분해서 출력
		System.out.println();
		
		System.out.printf("x3 = %d\n", x3);
		System.out.printf("x3 = %(d\n", x3); //괄호 씌우기 -제외
		
		System.out.printf("x4 = %xd\n", x4); 
		System.out.printf("x4 = %x\n", x4); //16진수
		System.out.printf("x4 = %#x\n", x4);
		System.out.printf("x4 = %o\n", x4); //8진수
		System.out.printf("x4 = %#o\n", x4);
		System.out.println();
		
		System.out.printf("d1 = %f\n", d1); //실수 (소수 점 6자리 까지 가능 반올림:7자리에서)
		System.out.printf("d1 = %.14f\n", d1); 
		System.out.printf("d1 = %.3f\n", d1); 
		
		System.out.printf("str1 = %s\n", str1);
		System.out.printf("c1 = %c\n", c1);
	}

}
