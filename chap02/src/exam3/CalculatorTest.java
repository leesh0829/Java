package exam3;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		cal.poweron();
		
		int addd = cal.add(2, 5);
		
		double dividee = cal.divide(2, 5);
		
		System.out.println("sum = "+ addd);
		
		System.out.println("divide = "+ dividee);
		
		cal.poweroff();
	}

}
