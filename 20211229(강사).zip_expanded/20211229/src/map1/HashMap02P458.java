package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap02P458 {

	public static void main(String[] args) {
		// 식당 메뉴판을 만들어보세요.
		// key는 음식이름, value는 가격(정수)로 저장해주세요.
		// 메뉴는 5개 이상 집어넣어주세요.
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		Map<String, Integer> map = new HashMap<>();
		
		map.put("최강금돈까스", 15000);
		map.put("라무라", 14000);
		map.put("로쏘", 9900);
		map.put("오레노라멘", 7900);
		map.put("스프카레진", 12000);
		
		System.out.println("스프카레 진 가격 : " + map.get("스프카레진"));
		System.out.println("최강금돈까스 가격 : " + map.get("최강금돈까스"));
		System.out.println("오레노라멘 가격 : " + map.get("오레노라멘"));
	}
}
