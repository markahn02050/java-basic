package overriding;

public class Main01P265 {

	public static void main(String[] args) {
		// 판다와 호랑이를 생성해보겠습니다.
		
		Panda p1 = new Panda();
		p1.howl();
		p1.name = "판다1";
		p1.age = 3;
		p1.height = 105.9;
		p1.weight = 83;
		p1.offspring = 2;
		p1.getInfo();
		
		
		
		Tiger t1 = new Tiger();
		t1.howl();
		t1.name = "호랭이";
		t1.age = 4;
		t1.height = 184;
		t1.weight = 222.5;
		t1.claw = true;
		t1.getInfo();
		
		
		
		
		
		

	}

}
