package math1;

import java.util.Scanner;

public class Math06 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[] comValue = { "가위", "바위", "보" };

		while(true) {
			
			System.out.println("가위 바위 보 게임입니다. STOP을 입력하시면 게임이 멈춥니다.");
			
			String myValue = scan.nextLine();

			if (myValue.equals("STOP")) {
				
				System.out.println("게임을 종료합니다...");
				
				break;
			}

			int i = (int) (Math.random() * 3);

			System.out.println("사용자: " + myValue + ", 컴퓨터: " +  comValue[i]);

			if(myValue.equals(comValue[i])) {
				
				System.out.println("비겼습니다");
				
			} 
			
			else if((myValue.equals("가위") && comValue[i].equals("보")) || (myValue.equals("바위") && comValue[i].equals("가위"))
					|| (myValue.equals("보") && comValue[i].equals("바위"))) {	
				
				System.out.println("이겼습니다");
							
			} 
				
			else {
				
				
				System.out.println("졌습니다");
			}
		}
	}
	

}
