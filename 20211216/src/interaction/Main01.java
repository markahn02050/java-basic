package interaction;

public class Main01 {

	public static void main(String[] args) {
		// Main function
		
		Seller s1 = new Seller(5);
		
		Buyer b1 = new Buyer(6000);
		
		s1.showSeller();
		b1.showBuyer();

		b1.BuyMango(s1, 5);
		
		s1.showSeller();
		b1.showBuyer();
		

	}

}
