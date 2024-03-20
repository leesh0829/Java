package ex01;

public class Car {
	int gas;	//필드
	
	public void gasCharge() { //메소드
		while(true)  {
			gas++;
			System.out.printf("gas 충전 중(잔량 : %d)\n", gas);
			
			if(gas == 3) {
				System.out.println("\n**** gas 충전 완료 ****");
				
			return;
			}
		}
	}
}
