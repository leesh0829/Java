package test;

public class Test02 {

	public static void main(String[] args) {
		String a = "123";
		String b = "a";
		String c = "125";
		String d = "40000000000";
		String e = "2e3";
		String f = "true";
		
		byte b1 = Byte.parseByte(a);
		//char v2 = Character.parseChar(b); //문자열을 문자로 변환 불가
		int v3  = Integer.parseInt(c);
		long v4 = Long.parseLong(d);
		double v5 = Double.parseDouble(e);
		boolean v6 = Boolean.parseBoolean(f);
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		System.out.println("b1 + v3" + (b1 + v3));
	}

}
