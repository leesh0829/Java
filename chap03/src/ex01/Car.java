package ex01;

public class Car {
	int gas;	//�ʵ�
	
	public void gasCharge() { //�޼ҵ�
		while(true)  {
			gas++;
			System.out.printf("gas ���� ��(�ܷ� : %d)\n", gas);
			
			if(gas == 3) {
				System.out.println("\n**** gas ���� �Ϸ� ****");
				
			return;
			}
		}
	}
}
