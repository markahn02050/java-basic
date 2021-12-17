package game.accessmodifier;

public class Main02 {

	public static void main(String[] args) {
		// Main02
		
		// 전사를 생성하고 정보를 불러옵니다.
		Warrior w1 = new Warrior("신짜오");		
		w1.getInfo();
		
		// 전사가 사냥을 하고 정보를 갱신합니다.
		w1.hunt();
		w1.getInfo();
		
		
		// 전사가 두번 공격하고 그 정보를 갱신합니다.
		w1.doubleAttack();
		w1.getInfo();
		
		w1.doubleAttack();
		w1.getInfo();
	}

}
