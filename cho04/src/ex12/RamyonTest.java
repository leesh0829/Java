package ex12;

import java.util.Scanner;

public class RamyonTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int order;
		
		SpecialRamyon ch = new SpecialRamyon("ġ��");
		SpecialRamyon dd = new SpecialRamyon("��");
		
		do {
			System.out.print("��� ���� (1.�Ϲ�   2.��   3.ġ��   0.����)");
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
		
		System.out.println("����!");
	}

}
