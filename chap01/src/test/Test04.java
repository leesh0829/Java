package test;

import java.util.Random;

public class Test04 {

	public static void main(String[] args) {
		Random rand = new Random();
		int score = rand.nextInt(101);
		if(score<60) System.out.println(score + "�� - ���հ�");
		else System.out.println(score + "�� - �հ�");
		
	}

}
