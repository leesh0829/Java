package exam9;

public class CarGasTest {

	public static void main(String[] args) {
		
		CarGas myCar = new CarGas();
		
		myCar.setGas(5);
		System.out.printf("gas ��: %d", myCar.gas);
//		myCar.gas = 10;
//		System.out.printf("gas ��: %d", myCar.gas);
		
		if(myCar.emptyGas())
		{
			System.out.println("����մϴ�");
			myCar.run();
		}
	}

}
