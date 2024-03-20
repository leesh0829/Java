package exam9;

public class CarGas {
	
	int gas;
	
	public void setGas(int gas) {
		this.gas = gas;
		
	}
	
	public boolean emptyGas() {
		if(gas == 0)
			return true;
		else 
			return false;
		
		
	}
	
	public void run() {
		while(true) {
			if(gas > 0)	
			{
				System.out.printf("주행 중 -- (gas 잔량: %d) \n", gas);
				gas--;
			}
			else 
				{
					System.out.printf("정지 -- (gas 잔량: %d) \n", gas);
					System.out.printf("현재 gas = %d, 가스 충전 필요!! \n");
					return; //run 메소드 종료
				}
		}
	}
}
