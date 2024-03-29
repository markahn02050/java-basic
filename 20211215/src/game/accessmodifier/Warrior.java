package game.accessmodifier;

public class Warrior extends Commoner {
	
	public Warrior(String name) {
		
		super(name);
			
	}
	
	public void hunt() {
		
		System.out.println("전사가 사냥을 시작합니다.");	
		int nowHp = getHp() - 2 ;
		setHp(nowHp);
		// 경험치도 마찬가지로 setExp()
		int nowExp = getExp() + 10;
		setExp(nowExp);	 
		
	}
	
	public void doubleAttack() {
		
		setExp(getExp() + 25);
		
		setHp(getHp() - 4);
		
		
		
	}
	
	public void getInfo() {
		// 심지어 private요소는 수정이 아닌 조회도 불가능합니다.
		System.out.println("현재 체력 : " + getHp());	
		System.out.println("현재 마나 : " + getMp());
		System.out.println("현재 레벨 : " + getLv());
		System.out.println("현재 경험치 : " + getExp());
		System.out.println("현재 이름 : " + getName());

	}

}
