package interaction;

public class Main {

	public static void main(String[] args) {
		// Main
		
		Seller s1 = new Seller(30, 40);
		
		Buyer b1 = new Buyer(200000);
		
		s1.showSeller();//상인1정보
		b1.showBuyer();// 구매자정보
		
		b1.buyMango(s1, 5);
		b1.buyMelon(s1, 2);
		
		s1.showSeller();//상인1정보
		b1.showBuyer();// 구매자정보
		
		
		
	}

}
