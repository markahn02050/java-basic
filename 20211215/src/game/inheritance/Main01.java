package game.inheritance;

public class Main01 {

	public static void main(String[] args) {
		// 초보자 계정을 하나 생성하고 정보를 조회해보세요.
		Commoner c1 = new Commoner("피오라");	
		c1.getInfo();
		
		Warrior w1 = new Warrior("리븐");
		w1.getInfo();

	}

}
