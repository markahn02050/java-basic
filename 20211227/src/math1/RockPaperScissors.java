package math1;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		int myValue;

		int comValue = (int)(Math.random()* 3 + 1);

			
			System.out.println("가위(1), 바위(2), 보(3) 중에 입력하세요.");
			
			myValue = scan.nextInt();
				
			// int parseMyValue = Integer.parseInt(myValue);
			
			if(myValue <= 0 && myValue >= 4) {
				
				System.out.println("1에서 3사이의 숫자를 입력해주세요.");
				
						
			}
			
			else {
				
				System.out.println(myValue + "를 입력받았습니다.");
				
				
			}
			
			// 가위바위보 시작	
			System.out.println("컴퓨터가 낸 것: " + comValue );
			
			if(myValue == comValue) {
				
				System.out.println("비겼습니다.");
			}
			
			else if(myValue == 1 && comValue == 3) {
				
				System.out.println("당신이 이겼습니다.");
			}
			
			else if(myValue == 2 && comValue == 1) {
				
				System.out.println("당신이 이겼습니다.");
			}
			
			else if(myValue == 3 && comValue == 2) {
				
				System.out.println("당신이 이겼습니다.");
			}
			
			else {
				
				System.out.println("당신이 졌습니다.");
			}
		
			
		}
	
}


			
		




