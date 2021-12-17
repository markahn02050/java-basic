package interaction;

public class Seller {
	
	private int money;// 매출액
	private int mango;// 재고(개수)
	private int melon;
	
	
	public Seller(int mango, int melon) {
		this.money = 0;
		this.mango = mango;
		this.melon = melon;
	}

	
	public void sellMango(int mango) {
		
		if(this.mango < mango) {
			System.out.println("망고가 모자랍니다. 현재 재고 : " + this.mango);
			return;// 메서드 강제종료구문
		}
		
		this.mango -= mango;
		this.money += mango * 4000;
		
	}
	
	public void sellMelon(int melon) {
		
		if(this.melon < melon) {
			System.out.println("멜론이 모자랍니다. 현재 재고 : " + this.melon);
			return;// 메서드 강제종료구문
		}
		
		this.melon -= melon;
		this.money += melon * 7000;
		
	}
	
	
	public void showSeller() {
		System.out.println("-------상인정보-------");
		System.out.println("현재소지금 : " + this.money + ", 현재망고재고 : " + this.mango + ", 현재멜론재고 : " + this.melon);
		System.out.println("--------------------");
	}
	
	
	public int getMango() {
		return this.mango;
	}
	
	public int getMelon() {
		
		return this.melon;
	}
}





