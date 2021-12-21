package interface1;

public class Airplane implements Vehicle {
	
	private int speed;
	private int gas;
	private String name;
	
	public Airplane(String name) {
		
		this.gas = AIRPLANE_MAX_GAS;
		this.speed = MIN_SPEED;
		this.name = name;
		
	}
	@Override
	public void accel() {
		
		if((speed + AIRPLANE_INCREASE_SPEED) >= AIRPLANE_MAX_SPEED) {
			
			speed = AIRPLANE_MAX_SPEED;
			
			
		}
		
		else {
			
			speed += AIRPLANE_INCREASE_SPEED;
			
			
		}
		
		gas -= AIRPLANE_CONSUMING_FUEL;
			
	}

	@Override
	public void breakSpeed() {

		if((speed - AIRPLANE_DECREASE_SPEED) <= MIN_SPEED) {
			
			speed = MIN_SPEED;
			
		}
		
		else {
			
			speed -= AIRPLANE_DECREASE_SPEED;
			
		}
		
	}

	@Override
	public void reFuel() {
		
		if((gas + AIRPLANE_REFUEL) >= AIRPLANE_MAX_GAS) {
			
			gas = AIRPLANE_MAX_GAS;
					
		}
		
		else {
			
			gas += AIRPLANE_REFUEL;
			
		}
		
	}

	@Override
	public void showStatus() {
		// 비행기의 정보
		
		System.out.println("조종사명 : " + name);
		System.out.println("현재 비행기 속도 : " + speed);
		System.out.println("현재 연료량 : " + gas);
		
		
	}
	

}
