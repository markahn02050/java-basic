import java.util.Scanner;

public class ForQ6P118 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요.
		// *
		// **
		// ***
		// ****
		// 중첩 반복문의 어느곳이 세로, 가로를 담당하는지 생각해보세요.
		// 힌트 : 별 개수가 점점 늘어나는데, 점점 숫자가 커지는 변수가 뭐가 있을지 생각해보세요.	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하시면 그에 맞는 피라미드형 별을 만듭니다.");
		
		int userNum = scan.nextInt();
		
		System.out.println(userNum + "행까지 1씩 증가하는 피라미드를 만들겠습니다.");
		
		for(int i = 0; i < userNum; i++) {
					
			for(int j = 0; j < i + 1; j++) {
								
				System.out.print("★");
			
			}			
			
			System.out.println();
			
		}
		
		scan.close();		
	}

}
