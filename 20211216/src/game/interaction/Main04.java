
package game.interaction;

public class Main04 {
	
	public static void main(String[] args) {
		// 전사 생성
		Warrior w1 = new Warrior();
		
		// 마법사 생성
		Magician m1 = new Magician();
		
		// 궁수 생성
		Archer a1 = new Archer();
		
		// 몬스터 생성
		Monster slime = new Monster();
		
		w1.huntMonster(slime); 
		w1.huntMonster(slime); 
		
		m1.huntMonster(slime);
		m1.huntMonster(slime);
		
		a1.huntMonster(slime);
		a1.huntMonster(slime);
		
		
	}

}
