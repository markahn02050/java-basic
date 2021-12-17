import java.util.Scanner;

public class ElseIfQ1P97 {

	public static void main(String[] args) {
		// 성적 판독기를 만들어보겠습니다.
		// if ~ else if ~ else 구문을 사용해 만들어주세요.
		// 성적기준 95이상 A+, 90이상 A0, 85이상 B+, 80이상 B0
		// 75이상 C+, 70이상 C0, 65이상 D+, 60이상 D
		// 60미만 F로 프린트구문으로 출력해주세요.
		// 스캐너로 int score 변수에 성적을 입력받습니다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("성적 판독기입니다. 점수를 입력해주세요.");
		int score = scan.nextInt();
		
		System.out.println(score + "점을 입력받았습니다.");
		
		if (score >= 95) {
			
			System.out.println("위 점수의 성적은 A+ 입니다.");
						
		}
		
		else if (score >= 90) {
			
			System.out.println("위 점수의 성적은 A0 입니다.");
						
		}
		
		else if (score >= 85) {
			
			System.out.println("위 점수의 성적은 B+ 입니다.");
						
		}
		
		else if (score >= 80) {
			
			System.out.println("위 점수의 성적은 B0 입니다.");
						
		}
		
		else if (score >= 75) {
			
			System.out.println("위 점수의 성적은 C+ 입니다.");
						
		}
		
		else if (score >= 70) {
			
			System.out.println("위 점수의 성적은 C0 입니다.");
						
		}
		
		else if (score >= 65) {
			
			System.out.println("위 점수의 성적은 D+ 입니다.");
						
		}
		
		else if (score >= 60) {
			
			System.out.println("위 점수의 성적은 D0 입니다.");
						
		}
		
		else {
			
			System.out.println("위 점수의 성적은 F 입니다.");			
			
		}
	
		scan.close();
	}

}
