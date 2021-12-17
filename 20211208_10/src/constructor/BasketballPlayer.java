package constructor;

public class BasketballPlayer {
	
	public double height;
	
	public double jumpHeight;
	
	public BasketballPlayer(double h, double jump) {
			
		height = h;
		
		jumpHeight = jump;
		
		System.out.println("생선된 선수 키: " + height + ", 점프력 :" + jumpHeight);
			
	}
	
	public void dunkShoot() {
		
		if((height + jumpHeight) > 300) {
			
			System.out.println("덩크슛에 성공했습니다.");
							
		}
		
		else {
			
			System.out.println("골대에 닿지 않았습니다.");
			
		}
		
		
	}
	
	
	

}
