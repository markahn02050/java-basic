package game.accessmodifier;

public class Magician extends Commoner {
	
	public Magician(String name) {
		super(name);
		
	}

	public void hunt() {
		
		System.out.println("마법사가 사냥을 시작합니다.");
		// hp -= 2; 를 직접 실행할 수 없으므로
		// public인 setter(setHp)를 이용합니다.
		// setHp(5)인 경우, 기존의 값 대신 hp변수에 5로 교체해달라는 요청임
		// 현재 원하는것은, 현 hp값에서 사냥할때마다 2씩 체력이 깎이는것입니다.	
		int nowHp = getHp() - 2 ;
		setHp(nowHp);
		// 경험치도 마찬가지로 setExp()
		int nowExp = getExp() + 10;
		setExp(nowExp);
		// exp += 10; (x)
		// 현재 원하는것은, 현 exp값에서 사냥할때마다 10씩 경험치가 증가하는것입니다.
		 
		
	}
	
	public void fireBall() {
		
		setMp(getMp() - 2);
		setExp(getExp() + 20);
		
	}
	
	public void heal() {
		
		setMp(getMp() - 2);	
		setHp(getHp() + 10);
		
		
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
