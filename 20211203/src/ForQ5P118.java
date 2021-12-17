import java.util.Scanner;

public class ForQ5P118 {

	public static void main(String[] args) {
		// Scanner로 정수를 입력받게 해주세요.
		// 입력받은 정수의 제곱 형태의 직사각형이 찍히도록
		// 중첩 반복문을 작성해주세요.	
		// 3 입력시
		// ***
		// ***
		// ***
		// 처럼 출력
		// 가로줄 출력시 System.out.print("*");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하면 그 숫자의 제곱만큼의 정사각형 넓이를 보여줍니다.");

		int userNum = scan.nextInt();
		
		System.out.println(userNum + "을(를) 입력받았습니다.");
		
		for(int i = 0; i < userNum; i++) {
			
			
			for(int j = 0; j < userNum; j++) {
				
				
				System.out.print("* ");
							
				
			}
			
			System.out.println();
					
			
		}
		
		
		scan.close();
		

	}

}
