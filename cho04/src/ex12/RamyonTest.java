package ex12;

import java.util.Scanner;

public class RamyonTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int order;
		
		SpecialRamyon ch = new SpecialRamyon("치즈");
		SpecialRamyon dd = new SpecialRamyon("떡");
		
		do {
			System.out.print("라면 선택 (1.일반   2.떡   3.치즈   0.종료)");
			order = scan.nextInt();
		
			if( order == 1 ) {
				SpecialRamyon.boilwater();
				SpecialRamyon.cooking();
				SpecialRamyon.eating();
			}
			
			if( order == 2 ) {
				SpecialRamyon.boilwater();
				SpecialRamyon.cooking();
				dd.outtopping();
				SpecialRamyon.eating();
			}
			
			if( order == 3 ) {
				SpecialRamyon.boilwater();
				SpecialRamyon.cooking();
				ch.outtopping();
				SpecialRamyon.eating();
			}
		}while(order != 0);
		
		System.out.println("종료!");
	}

}
