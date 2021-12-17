package game.inheritance;

public class Warrior extends Commoner {
	
	private int pDam;
	
	public Warrior(String name) {
		
		super(name);
		
		this.pDam = 80;
		
		System.out.println("전사를 생성합니다.");
		
	}
	
	public void getInfo() {
		
		System.out.println("아이디: " + id + ", 레벨: " + level + ", 체력: " + hp + ", 마나: " + mp + ", 물리데미지 : " + pDam);
			
		
	}
	
	

}
