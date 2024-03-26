package test;

import java.util.Random;

public class Test04 {

	public static void main(String[] args) {
		Random rand = new Random();
		int score = rand.nextInt(101);
		if(score<60) System.out.println(score + "점 - 불합격");
		else System.out.println(score + "점 - 합격");
		
	}

}
