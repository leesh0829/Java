package exam13;
//page61 9
public class foreach01 {

	public static void main(String[] args) {
		int[] a = {95, 71, 84, 93, 88};
		
		int sum = 0;
		float ave = 0;
		for(int i : a)
		{
			sum += i;
			ave = (float)sum/5;
		}

		System.out.printf("Á¡¼ö ÃÑÇÕ=%d\n", sum);
		System.out.printf("Á¡¼ö Æò±Õ = %.2f", ave);
	}

}
