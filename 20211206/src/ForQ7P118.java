import java.util.Scanner;

public class ForQ7P118 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요.
		// ****
		// ***
		// **
		// *
		// 중첩 반복문의 어느곳이 세로, 가로를 담당하는지 생각해보세요.
		// 힌트 : 별 개수가 점점 줄어드는데,  i--와 j--와 같이 이번에는
		// 변수 크기를 줄여가면서 진행하셔야 합니다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("원하시는 정수를 입력하면 그 수만큼 역피라미드를 출력합니다.");

		int scanNum = scan.nextInt();
		
		for(int i = 0; i < scanNum; i++) {
			
			
			for(int j = scanNum; j > i; j--) {
				
				System.out.print("★");				
				
			}
			
		System.out.println();
			
			
		}
		
		scan.close();
		
	}

}
