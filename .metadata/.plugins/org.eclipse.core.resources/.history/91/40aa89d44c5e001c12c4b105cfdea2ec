package interaction;

public class Seller {
	
	private int money;
	private int mangoStock;
	
	public Seller(int mango) {
		
		
		this.money = 0;
				
		this.mangoStock = mango;
		
	}
	
	public void sellMango(int mango) {
		
		if(this.mangoStock >= mango) {
			
			this.mangoStock -= mango;
			
			this.money += mango * 1000; // 망고 한개에 천원			
					
		}
		
		else {
					
			System.out.println("망고가 모자랍니다.");
			
		}
				
	}
	
	public void showSeller() {
		
		System.out.println("========상인정보========");
		System.out.println("현재소지금: " + money + ", 현재망고재고: " + mangoStock);
		System.out.println("======================");
		
		
	}

	public int getMango() {
		return this.mangoStock;
	}
	
	
	

}
