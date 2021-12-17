import java.util.Scanner;

public class LoopCounter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("원하는 숫자를 입력하시면 그 숫자만큼 반복문을 실행합니다.");
		
		String numStr = scan.nextLine();
		
		System.out.println(numStr + "를 입력받았습니다.\n");
		
		int loop = Integer.parseInt(numStr);
		
		// 반복문 횟수를 세기위한 변수 counter
		int counter = 0;
		
		while(counter < loop) {		
			
			counter += 1;
			
			System.out.println(counter + "번째 반복문을 실행중입니다.");			
			
		}
		
		System.out.println("\n반복문을 종료합니다.");
			
		scan.close();		
		
	}

}
