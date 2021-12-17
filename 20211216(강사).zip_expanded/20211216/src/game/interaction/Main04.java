package game.interaction;

public class Main04 {

	public static void main(String[] args) {
		// 각 직업군별로 하나씩 생성
		Warrior w1 = new Warrior();
		Thief t1 = new Thief();
		Magician m1 = new Magician();
		
		// 드래곤 생성
		Dragon d1 = new Dragon();
		
		w1.huntDragon(d1);
		t1.huntDragon(d1);
		m1.huntDragon(d1);
		w1.huntDragon(d1);
		t1.huntDragon(d1);
		m1.huntDragon(d1);
	}
}
