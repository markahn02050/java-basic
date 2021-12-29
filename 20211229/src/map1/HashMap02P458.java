package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap02P458 {

	public static void main(String[] args) {
		// 식당 메뉴판을 만들어보세요.
		// key는 음식이름, value는 가격(정수)로 저장해주세요.
		// 메뉴는 5개 이상 집어넣어주세요.
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		
		Map<String, Integer> menu = new HashMap<>();
		
		menu.put("김치찌개", 8000);
		menu.put("된장찌개", 8000);
		menu.put("떡만두국", 9000);
		menu.put("라면", 3500);
		menu.put("떡볶이", 4000);
		
		System.out.println("라면의 가격은 " + menu.get("라면") + "원입니다.");
		System.out.println("된장찌개의 가격은 " + menu.get("된장찌개") + "원입니다.");
		System.out.println("떡만두국의 가격은 " + menu.get("떡만두국") + "원입니다.");

	}

}
