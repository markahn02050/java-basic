package interface1;

public class Train implements Vehicle {
	
	public int speed;
	public int gas;
	public String name;
	
	// Constructor
	public Train(String name) {
		
		this.gas = MAX_GAS;
		this.speed = MIN_SPEED;
		this.name = name;
		
	}
	

	@Override
	public void accel() {
		
		if((speed + TRAIN_INCREASE_SPEED) >= TRAIN_MAX_SPEED) {
			
			speed = TRAIN_MAX_SPEED;
			
			
		}
		
		else {
			
			speed += TRAIN_INCREASE_SPEED;
			
			
		}
		
		gas -= TRAIN_CONSUMING_GAS;
			
	}

	@Override
	public void breakSpeed() {

		if((speed - TRAIN_DECREASE_SPEED) <= MIN_SPEED) {
			
			speed = MIN_SPEED;
			
		}
		
		else {
			
			speed -= TRAIN_DECREASE_SPEED;
			
		}
		
	}

	@Override
	public void reFuel() {
		
		if((gas + TRAIN_REFUEL) >= MAX_GAS) {
			
			gas = MAX_GAS;
					
		}
		
		else {
			
			gas += TRAIN_REFUEL;
			
		}
		
	}

	@Override
	public void showStatus() {
		// 기차의 정보
		
		System.out.println("기관사명 : " + name);
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 연료량 : " + gas);
		
		
	}
	
	
	
	

}
