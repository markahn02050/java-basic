package constructor;

public class Car {
	
	// 자동차의 상태(속성)를 나타내는 변수들
	public int gas; // 연료량
	public int speed; // 속도
	public String owner; // 차주
	
	
	// 자동차 생성자(new키워드로 생성시 실행된 메서드)
	// 리턴타입은 기입하지 않습니다.
	// 클래스 이름은 Car로 메서드명이 고정됩니다.
	// 생성시 자동으로 호출되기 때문에 무시하고 넘어갈 수 없습니다.
	public Car(int g, String o) {
		
		gas = g;	
		speed = 0;	
		owner = o;
		
		System.out.println("자동차 생성 완료!");
		System.out.println("연료 : " + gas + ", 속도 : " + speed + ", 주인 : " + owner);
		
	}
	// 자동차 동작 추가하기
	public void getInfo() {
		System.out.println("현재 연료량 : " + gas);
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 주인 : " + owner);
		System.out.println("--------------------");	
		
	}
	
	// 운전 기능 추가하기(가속하기)
	public void accelSpeed() {
		
		gas -= 2;
		speed += 10;
		
	}
	
	// 브레이크 기능 추가하기(감속하기)
	public void breakSpeed() {
	
		speed -= 10;
		
	}
	
	public void putGas() {
		
		speed = 0;
		gas += 10;
		
	}

}
