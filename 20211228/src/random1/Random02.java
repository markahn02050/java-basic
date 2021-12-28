package random1;

import java.util.Random;
import java.util.Scanner;

public class Random02 {

	public static void main(String[] args) {
		// 동전 던지기 카운팅 프로그램		
		// n회 던졌을 때 true가 나오면 앞면, false가 나오면 뒷면으로 간주
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("동전 던질 횟수를 알려주세요.");
		
		int coinNum = scan.nextInt();
		
		int front = 0;
		
		int back = 0;
		
		for(int i = 0; i < coinNum; i++) {
			
			Random random = new Random();
			
			boolean coinResult = random.nextBoolean();
			
			if(coinResult == true) {
							
				front += 1;			
				
			}
			
			else {
				
				back += 1;
							
			}
					
			
		}
			
		System.out.println(coinNum + "바퀴 돌린 결과값 : ");
		
		System.out.println("앞면 : " + front);
		
		System.out.println("뒷면 : " + back);
		
		scan.close();

	}

}
