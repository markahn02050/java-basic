import java.util.Scanner;

public class ContinueQ1_2P123 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int n  = scan.nextInt();
		
		int total = 0;
		
		for(int i = 1; i <= n; i++) {
			
			if(i % 2 == 0) {			
				
				continue;
			
			}
			
			total += i;	
			
			System.out.println("현재 1부터 " + i + "까지 더했습니다.");
			System.out.println("총합은 " + total + "입니다.");
				
		}
		
		scan.close();

	}

}
