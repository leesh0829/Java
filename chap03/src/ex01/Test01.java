package ex01;

public class Test01 {

	public static void main(String[] args) {
		int a [] = new int [5];
		String s [] = new String [5];
		boolean b [] = new boolean [4];
		
		s[0] = "사자";
		s[1] = "사자";
		s[2] = new String ("사자");
		s[3] = "코끼리";
		s[4] = "기린";
		
		b[0] = (s[0].equals(s[1]));
		b[1] = s[0] == s[1];
		b[2] = (s[1].equals(s[2]));
		b[3] = s[1] == s[2];
		
		System.out.println("a[0] = " + a[0]);
		
		System.out.println("s[0] = " + s[0]);
		System.out.println("s[1] = " + s[1]);
		System.out.println("s[2] = " + s[2]);
		System.out.println("s[3] = " + s[3]);
		System.out.println("s[4] = " + s[4]);
		
		System.out.println("b[0] = " + b[0]);
		System.out.println("b[1] = " + b[1]);
		System.out.println("b[2] = " + b[2]);
		System.out.println("b[3] = " + b[3]);
		
	}

}
