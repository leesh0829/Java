package test;

public class Test03 {

	public static void main(String[] args) {
		int sum = 0;
		
		System.out.print("sum = ");
		
		for(int i = 1; i <= 10; i++) {
			if(i%2 !=0) continue;
			if(i < 10)	System.out.print(i + " + ");
			if(i == 10)	System.out.print(i + " = ");
			sum+=i;
		}
		
		System.out.println(sum);
	}

}
