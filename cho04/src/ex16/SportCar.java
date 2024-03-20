package ex16;

public class SportCar extends Car{
	@Override
	public void Speedup() {
		speed= speed + 10;
	}
	
	//stop은 final로 되있어서 못 재정의 함 (최종상태이고 수정 할 수없음)
	
	
}
