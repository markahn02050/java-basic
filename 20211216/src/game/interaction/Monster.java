package game.interaction;

public class Monster {
	
	private int hp;
	private int atk;
	private int def;
	
	public Monster() {
		
		this.hp = 100;
		this.atk = 2;
		this.def = 0;
	}
	
	public void doBattle(int uAtk) {	
		
		hp = (hp + def) - uAtk;
		
		if(hp <= 0) {
			
			hp = 0; // 필수는 아님, 죽은 몬스터 체력은 0으로 보정
			System.out.println("몬스터가 죽어서 반응하지 않습니다.");
			return; // 메서드를 여기서 종료합니다.
		}
		
		System.out.println("몬스터의 남은 체력 : " + hp); //몬스터가 안 죽어야 실행됨
		
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
	
	
	
	
	
	
	
	

}
