package game.interaction;

public class Main03 {

	public static void main(String[] args) {
		// 마법사 생성
		Magician m1 = new Magician();
		// 오크 생성
		Orc o1 = new Orc();
		// 마법사 오크간 교전
		m1.huntOrc(o1);
		m1.huntOrc(o1);
		
		// 트롤 생성
		Troll t1 = new Troll();
		m1.huntTroll(t1);
		m1.huntTroll(t1);
		m1.huntTroll(t1);
		System.out.println("------------------------------------");
		// 도둑 생성
		Thief th1 = new Thief();
		
		// 오크2 생성
		Orc o2 = new Orc();
		
		th1.huntOrc(o2);
		th1.huntOrc(o2);
		
		// 트롤2 생성
		Troll t2 = new Troll();
		
		th1.huntTroll(t2);
		th1.huntTroll(t2);
		th1.huntTroll(t2);
		th1.huntTroll(t2);
		th1.huntTroll(t2);
		
		
		


	}

}
