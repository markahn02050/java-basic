package game.polymorphism;

public class Main {

	public static void main(String[] args) {
		// Commoner 생성
		Commoner c1 = new Commoner("초심자");
		
		Orc o1 = new Orc("오크", 15, 2);
		
		Dragon d1 = new Dragon("드래곤", 30, 5);
		
		Baron b1 = new Baron("바론", 100, 6);
		
		Wolf w1 = new Wolf("늑대", 10, 1);
		
		c1.hunt(o1);
		c1.hunt(o1);
		
		c1.hunt(d1);
		c1.hunt(b1);
		c1.hunt(w1);
		

	}

}
