package collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto03 {

	public static void main(String[] args) {
		// 로또복권 당첨 시뮬레이터를 만들어주세요.
		// 1. 당첨번호 6개를 뽑습니다.
		// 2. 추첨번호 6개를 뽑습니다.
		// 3. 당첨번호와 추첨번호를 비교해서 일치하면 반복 중지
		// 4. 3에서 일치하지 않으면 반복횟수를 1더하고 다시 추첨번호를 6개 뽑고
		// 이어서 비교해서 일치 여부 검사.
		
		int loopCount = 0;
		
		// 당첨번호
		List<Integer> lotto = new ArrayList<>();		
		// 당첨번호 6개
		for(int i = 0; i < 6; i++) {
			
			int lottoNum = (int)(Math.random() * 45) + 1;
			
			if(lotto.contains(lottoNum)) {
							
				i -= 1;
				
			}
			
			else {
				
				lotto.add(lottoNum);
				
			}						
		}
		
		// 추첨번호
		List<Integer> win = new ArrayList<>(); 	
		// 추첨번호 6개
		for(int i = 0; i < 6; i++) {
			
			int winNum = (int)(Math.random() * 45) + 1;
			
			if(win.contains(winNum)) {
							
				i -= 1;
				
			}
			
			else {
				
				win.add(winNum);
				
			}							
		}
		
		System.out.print(win);	
		System.out.print(lotto + "\n");
		
		while(true) {
				
			if(lotto.equals(win)) {
	
				break;
				
			}
			
			else {		
				
				lotto.clear();
				
				for(int i = 0; i < 6; i++) {
					
					int lottoNum = (int)(Math.random() * 45) + 1;
					
					if(lotto.contains(lottoNum)) {
									
						i -= 1;
						
					}
					
					else {
						
						lotto.add(lottoNum);
						
					}
				}
			
				loopCount += 1;
				
				Collections.sort(lotto);
				Collections.sort(win);
				
				System.out.print(win);	
				System.out.print(lotto + "\n");
					
			}

			
					
		}
		
		System.out.println("로또에 당첨되었습니다!");
		System.out.println("로또 구매 개수 : " + loopCount + "개");	
	}

}
