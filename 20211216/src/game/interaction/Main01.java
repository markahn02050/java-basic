package game.interaction;

public class Main01 {

	public static void main(String[] args) {
		// Main function
		Warrior w1 = new Warrior();
		
		Orc orc1 = new Orc();
		
		w1.huntOrc(orc1);
		
		Troll troll = new Troll();
		w1.huntTroll(troll);
		
		

	}

}
