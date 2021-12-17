import java.util.Scanner;

public class WhileQ1P105 {

	public static void main(String[] args) {
		// 스캐너를 이용해서 String num 변수에
		// "문자열 형태인 숫자"를 입력받게 해주세요.(scan.nextline()으로 문자열 입력받기)
		// 이 문자자료 num을 int loop 변수에 Integer.parseInt()로 정수변환해 저장하세요.
		// loop 변수에 입력된 정수 횟수만큼
		// "반복문을 실행합니다." 라는 문장이 콘솔에 출력되도록
		// while문을 작성해주세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("반복을 위해 숫자를 입력해주세요. ");
		
		String num = scan.nextLine();
		
		System.out.println(num + "을(를) 입력받았습니다.\n");
		
		int loop = Integer.parseInt(num);
		
		int counter = 0;
		
		while(counter < loop ) {
			
			// 반복문의 횟수를 세기위해 counter변수를 구문 반복마다 1만큼 증가시킴.
			counter += 1;
			
			// loop 변수에 입력된 정수 횟수만큼
			System.out.println(counter + "번째 " + "반복문을 실행합니다.");		
			
		}
		
		System.out.println("\n반복문을 종료합니다.");	

	}

}
