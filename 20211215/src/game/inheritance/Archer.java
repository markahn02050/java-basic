package game.inheritance;

public class Archer extends Commoner {
	
	private int rDam;
	
	public Archer(String name) {
		
		super(name);
		
		this.rDam = 70;
		
		System.out.println("궁수를 생성합니다.");
			
	}
	
	public void getInfo() {
		
		System.out.println("아이디: " + id + ", 레벨: " + level + ", 체력: " + hp + ", 마나: " + mp + ", 원거리데미지 : " + rDam);			
		
	}

}
