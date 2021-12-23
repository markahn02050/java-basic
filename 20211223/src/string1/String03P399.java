package string1;

import java.util.Scanner;

public class String03P399 {

	public static void main(String[] args) {
		// Scanner를 통해서 전체 문장을 입력받으세요.
		// 다음으로 문장내에서 찾고싶은 단어를 추가로 입력받으세요.
		// 문장 내에 있는 단어들의 인덱스 번호와, 몇개가 검출되었는지
		// 출력해주는 코드를 작성해보세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("전체 문장을 입력해주세요.");

		String sentence = scan.nextLine();
		
		System.out.println("문장 내에서 카운팅할 단어를 입력해주세요.");
		
		String searchVocab = scan.nextLine();
		
		// 갯수 카운팅
		int strCount = 0;
		
		// 반복문 추가 실행 여부
		boolean bool = true;
		// 마지막으로 발견된 지점
		int finalIndex = -1;
		
		while(bool) {
			
			// asdf를 먼저 찾고, 그 뒷번호의 인덱스부터 검사실행
			int get = sentence.indexOf(searchVocab, finalIndex + 1);
			
			if(get == -1) {
				
				bool = false;
							
			}
			
			else {
			
				finalIndex = get;
				
				strCount++;
				
				System.out.println(finalIndex + "에서 " + searchVocab + "이(가) " + strCount + "번째 발견되었습니다." );
				
				
			}
			
			
		}
		
		System.out.println(searchVocab + "의 총 출현 횟수는 " + strCount + "회입니다.");
		
		
		
		//for(int i = 0; i < sentence.length(); i++) {
			
		//	if(searchVocab.equals(sentence)) {
				
		//		strCount += 1;
				
		//	}
			
			
		//}
		
		//System.out.println("중복되는 문자열의 개수는: " + strCount);
	

	}

}
