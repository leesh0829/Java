package exam10;

public class ForBreakTest01 {

	public static void main(String[] args) {
		char c1;
		char c2;
		u: for(c1 = 'A'; c1<='Z'; c1++)
		{
			for(c2='a'; c2<='z'; c2++) {
				System.out.printf("%c %c - ", c1, c2);
			if(c2 == 'g')
				break u;
			}
			
		}
	}

}
