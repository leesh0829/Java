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
				System.out.printf("���� �� -- (gas �ܷ�: %d) \n", gas);
				gas--;
			}
			else 
				{
					System.out.printf("���� -- (gas �ܷ�: %d) \n", gas);
					System.out.printf("���� gas = %d, ���� ���� �ʿ�!! \n");
					return; //run �޼ҵ� ����
				}
		}
	}
}
