import java.util.Scanner;
public class ThreeOperndQ1 {

	public static void main(String[] args) {
		// int a에 여러분들이 원하는 숫자를 넣어주세요.
		// 그 숫자가 100보다 크다면 "a는 100보다 큽니다."
		// 100보다 작거나 같다면 "a는 100보다 작거나 같습니다."
		// 라고 출력하는 삼항연산자를 아래에 작성해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 숫자를 입력해주세요: ");						
		
		int a = sc.nextInt();
		
		System.out.println((a > 100 ? "a는 100보다 큽니다." : "a는 100보다 작거나 같습니다."));
	

	}

}
