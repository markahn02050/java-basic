package game.inheritance;

public class Magician extends Commoner {
	
	private int mDam;
	
	public Magician(String name) {
		
		super(name);
		
		this.mDam = 50;
		
		System.out.println("마법사를 생성합니다.");
			
	}
	
	public void getInfo() {
		
		System.out.println("아이디: " + id + ", 레벨: " + level + ", 체력: " + hp + ", 마나: " + mp + ", 마법데미지 : " + mDam);
			
		
	}

}
