
public class ForIJK {

	public static void main(String[] args) {
		
		for(int i = 0; i < 4; i++) {		
			// 별 왼쪽에 띄어쓰기가 찍히므로, 먼저 찍히도록 띄어쓰기를 셈.
			// 띄어쓰기는 3/2/1/0개 순으로 줄어들도록 반복횟수를 줄여준다.
			for(int j = 0; j < 4-i-1; j++) {
				
				System.out.print(" ");
			
				
			}
			
			for(int k = 0; k < i + 1; k++) {			
				
				System.out.print("*");
				
			}
					
			System.out.println();
			
			
		}

		
		
		
		
		
		
		
		
		

	}

}
