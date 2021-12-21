package interface1;

// 인터페이스 구현(상속이 아님)하기위해서는
// extends 대신에 implements를 사용합니다.
// 인터페이스 내부의 추상메서드는 무조건 전부 구현해야합니다.
public class Car implements Vehicle{
	// 자동차라면 가져야 하는 변수 설정
	// 현재속도, 현재연료량, 차주
	private int speed;
	private int gas;
	private String name;
	
	// 생성자를 만들어주세요. 차주만 입력받고
	// 나머지 요소는 현재 속도 0, 연료량 100을 자동으로 대입해주세요.
	public Car(String name) {
		
		this.speed = MIN_SPEED;
		this.gas = MAX_GAS;
		this.name = name;	
		
	}
	
	@Override
	public void accel() {
		// 한 번 가속시 속도가 10씩 늘어나도록 해주세요.
		// 연료는 한 번 가속에 1씩 소비합니다.
		// 단 속도는 200을 초과할 수 없습니다.
		if((speed + CAR_INCREASE_SPEED) >= CAR_MAX_SPEED) {
			
			speed = CAR_MAX_SPEED;
					
		}
		
		else {
			
			speed += CAR_INCREASE_SPEED;
			gas -= CAR_CONSUMING_GAS;
					
		}
		
	}

	@Override
	public void breakSpeed() {
		// 한 번 감속할때마다 속도가 10씩 줄도록 해주세요.
		// 단, 속도가 0 미만이 될 수 없습니다.
		if((speed - CAR_DECREASE_SPEED) <= MIN_SPEED) {
			
			speed = MIN_SPEED;
			
		}
		
		else {
			
			speed -= CAR_DECREASE_SPEED;
			
		}
		
	}

	@Override
	public void reFuel() {
		// 연료는 다시 채울때마다 30씩 채워줍니다.
		// 단, 연료 최대값은 상수 MAX_GAS를 이용해서 측정해주세요.
		
		if((gas + CAR_REFUEL) >= MAX_GAS) {
			
			gas = MAX_GAS;
		
		}
		
		else {
			
			gas += CAR_REFUEL;
			
		}
					
	}

	@Override
	public void showStatus() {
		// 자동차의 정보를 조회할 수 있도록 작성해주시면 됩니다.
		System.out.println("자동차의 정보입니다. ");
		System.out.println("차주 : " + name + ", 현재연료량 : " + gas + ", 현재속도 : " + speed);
		
	}

}
