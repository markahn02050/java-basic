package collections2;

import java.util.ArrayList;
import java.util.List;

public class lotto02 {

	public static void main(String[] args) {
		// List 역시 참조형 변수이기 때문에 비교시 주소값끼리 비교합니다.
		// 따라서 단순 == 비교가 아닌 리스트1.equals(리스트2)
		// 를 이용해 주소값이 아닌 실제 힙에 저장된 데이터 비교를 해줘야
		// 로또복권 리스트 내부 숫자가 일치하는지 비교할 수 있습니다.
		// equals는 내부 요소의 순서까지 같이 비교합니다.
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		
		System.out.println("주소값 비교 : " + (l1 == l2));
		
		// 둘 다 빈 리스트이므로 내부에 든 자료끼리만 비교했을때는 true임
		System.out.println("" + l1 + l2);
		System.out.println("내부에 든 자료 비교 : " + l1.equals(l2));
		
		
		// l1과 l2에 각각 요소를 입력하되, 순서에 따른 결과 확인하기.
		
		for(int i = 0; i < 10; i++) {
				
			l1.add(i);
			
		}
		
		for(int j = 10; j < 20; j++ ) {
			
			l2.add(j);
			
		}
		
		
		System.out.println(l1);
		System.out.println(l2);
		
		System.out.println(l1.equals(l2));
			
		
	}

}
