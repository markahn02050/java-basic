package game.interaction;

public class Main02 {

	public static void main(String[] args) {
		// Main function
		
		// 전사 생성
		Warrior w1 = new Warrior();
		
		Orc o1 = new Orc();
		
		// 트롤 생성
		Troll troll = new Troll();
		
		// 마법사 생성
		Magician m1 = new Magician();
		
		// 궁수 생성
		Archer a1 = new Archer();
		
		// 교전 2번
		w1.huntTroll(troll);
		w1.huntTroll(troll);
		w1.huntTroll(troll);
		w1.huntTroll(troll);
		w1.huntTroll(troll);
		
		m1.huntOrc(o1);
		m1.huntOrc(o1);
		m1.huntTroll(troll);
		m1.huntTroll(troll);
		
		a1.huntOrc(o1);
		a1.huntTroll(troll);
			

	}

}
