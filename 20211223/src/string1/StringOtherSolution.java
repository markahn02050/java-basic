package string1;

import java.util.Scanner;

public class StringOtherSolution {
	
		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			
			System.out.println("전체 문장을 입력해주세요.");
			
		    String sentence = scan.nextLine();
		    
		    System.out.println("문장 내에서 카운팅할 단어를 입력해주세요.");
		    
		    String searchVocab = scan.nextLine();
		    
		    int strCount = 0;
		    
		    int get = 0;

		    for(int i = 0; i < sentence.length(); i++) {
		    	
		    	if(get > -1 && get != get){
		    		
		    		get = sentence.indexOf(searchVocab, i);
	   	
					strCount += 1;
					
					System.out.println(get + "번에서 " + strCount + "번째 " + searchVocab + "이(가) 검출되었습니다.");

		    	}
		    	
		    	else {
		    		
		    		System.out.println("해당 인덱스에서 단어를 찾지 못했습니다.");
		    		
		    	}
	   			   
			}
		   
		   System.out.println(searchVocab + "의 총 출현 횟수는 " + strCount + "회입니다.");

	   
		}
		   
		   
		    	
	}


