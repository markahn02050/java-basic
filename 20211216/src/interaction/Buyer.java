package interaction;

public class Buyer {
	
	private int money;
	private int nowMango;

	
	public Buyer(int money) {			
		
		this.money = money;
		this.nowMango = 0;
	}
	
	public void BuyMango(Seller seller, int mango) {
		
		if(this.money >= (mango * 1000)) {	
						
			if(seller.getMango() >= mango) {
				
				this.money -= mango * 1000;
				
				seller.sellMango(mango);
				
				this.nowMango += mango;
						
			}
			
			else {
				
				System.out.println("망고 재고가 부족합니다");
				
			}		
			
		}
		
		else {

			System.out.println("돈이 모자랍니다.");
		}
	
	}

	public void showBuyer() {
		
		System.out.println("========구매자정보========");
		System.out.println("현재소지금: " + this.money + ", 구입한 망고개수: " + this.nowMango);
		System.out.println("=======================");
	}
	

}
