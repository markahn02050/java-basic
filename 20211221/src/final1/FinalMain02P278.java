package final1;

public class FinalMain02P278 {

	public static void main(String[] args) {
		// 일반 숫자를 이용한 출력요소
		System.out.println("전사의 체력 : " + 50);
		System.out.println(50);
		System.out.println("몬스터의 경험치 : " + 20);
		System.out.println(20);
		
		// 상수는 Camel Case를 쓰는 대신
		// 대문자로 모두 작성하고 띄워쓰기는 _로 대체한다.
		final int WARRIOR_HP = 50;
		final int MONSTER_EXP = 20;
		
		System.out.println(WARRIOR_HP);
		System.out.println(MONSTER_EXP);
		System.out.println(WARRIOR_HP);
		System.out.println(MONSTER_EXP);
		System.out.println(WARRIOR_HP);
		System.out.println(MONSTER_EXP);

	}

}
