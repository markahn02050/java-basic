package exception2;

import java.util.Arrays;
import java.util.Scanner;

public class TryCatch02P353 {

	public static void main(String[] args) {
		// 아까 exception1 패키지 내부의 여러 예외 유형 중
		// 하나를 골라서 예외가 발생할 수 있는 코드를 작성해주세요.
		// 발생할 예외에 대한 처리는 try~catch블록을 활용합니다.
		// / by zero(0으로 나누기)에 대한 처리는 허용하지 않습니ㅏㄷ.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("원하는 정수를 입력하시면 그 수만큼의 크기의 배열을 만듭니다.");
		
		int newIndex = scan.nextInt();
		
		int[] arr = new int[newIndex];
		
		int count = 0;
		
		try {
			
			System.out.println("실행 시작!");
			
			System.out.println("입력받은 배열의 크기는 " + newIndex + "입니다.");
			
			System.out.println(arr[newIndex]);
			
			
		}
		
		catch(Exception e) {
					
			System.out.println("arr[" + newIndex + "]번은 배열의 크기를 초과했습니다.");
			System.out.println(Arrays.toString(arr));
					
		}
		
		finally {
			
			System.out.println("코드 종료!");
			
		}
		
		scan.close();
			

	}

}
