package constructor;

public class Main01P204 {

	public static void main(String[] args) {
		// 자동차 한 대를 만들어주세요.
		// 연료량은 100
		// 속도는 0
		// 주인은 본인이름으로 만들어주세요.		
		Car myCar = new Car(100, "안해찬");
		
		//myCar.gas = 100;		
		//myCar.speed = 0;	
		//myCar.owner = "안해찬";
		
		// 차를 뽑자마자 먼저 상태 확인
		myCar.getInfo();
		 
		// 액셀을 두 번 밟아주세요.
		myCar.accelSpeed();
		myCar.accelSpeed();
		
		// 상태 다시 확인
		myCar.getInfo();
		
		
		// 브레이크를 밟아주세요
		myCar.breakSpeed();
				
		// 상태 다시 확인
		myCar.getInfo();
		
		myCar.putGas();
		
		myCar.getInfo();

	}

}
