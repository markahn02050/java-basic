package game.inheritance;

public class Commoner {
	// 부모클래스
	protected int level;
	protected int hp;
	protected int mp;
	protected String id;
	
	public Commoner(String id) {
		
		this.level = 1;
		this.hp = 20;
		this.mp = 10;
		
		this.id = id;
						
	}
	
	public void getInfo() {
				
		System.out.println("아이디: " + id + ", 레벨: " + level + ", 체력: " + hp + ", 마나: " + mp);
			
	}
	
	
	
	
	
	

}
