package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto01 {

	public static void main(String[] args) {
		// 로또복권 추첨기를 만들어보겠습니다.
		// 로또복권 추첨기는 1~45 범위에서 겹치는 숫자 없이
		// 6개의 숫자를 뽑습니다.
		// 순서를 정렬해서 콘솔에 찍어주도록 만들어주세요.
		// ArrayList의 정렬은 .sort() 대신
		// Collections.sort(ArrayList)를 사용합니다.
		
		List<Integer> lotto = new ArrayList<>();
		
		int secondNum = 0;
		
		
		for(int i = 0; i < 6; i++) {
			
			int randNum = (int)(Math.random() * 45) + 1;
			
			if(lotto.contains(randNum)) {
							
				i -= 1;
				
			}
			
			else {
				
				lotto.add(randNum);
				
			}
							
		}
		
		while(true) {
			
			secondNum = (int)(Math.random() * 45) + 1;
			
			if(!lotto.contains(secondNum)) {
				
				break;
				
			}
					
		}
		
		Collections.sort(lotto);
		
		System.out.print("추첨된 번호 : ");
		
		for(Integer i : lotto) {
			
			System.out.print(i + " ");
		}
		
		
		System.out.println("\n2등당첨번호 : " + secondNum);
			

	}

}
