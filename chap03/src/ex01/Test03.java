package ex01;

public class Test03 {

	public static void main(String[] args) {
		String[] old = {"����", "�ÿ�", "�ʷ�"};
		String[] ne = new String [old.length + 3];
		
		ne[5] = "���";
		
		for(int i = 0; i < old.length; i++) {
		System.out.printf("old[%d] = %s \n", i, old[i]); }
		
		System.out.println();
		
		for(int i = 0; i < ne.length; i++) {
			System.out.printf("ne[%d] = %s \n", i, ne[i]); }
		}
	}
