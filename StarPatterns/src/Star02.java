import java.util.Scanner;

public class Star02 {
	
	public static void main(String[] args) {
		
		
		// Decalcomanie main function		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 숫자를 입력하면 그 수만큼 데칼코마니를 만듭니다.");
		
		int userNum = sc.nextInt();
		
		System.out.println(userNum + "을(를) 입력받았습니다.\n");
		
		// Star patterns for increasing
		for(int i = 0; i < userNum; i++) 	
		{
			for(int j = 0; j < i + 1; j++) {
				
				System.out.print("♠");
								
			}
			
			System.out.println();		
		
		}
		
		// Star patterns for decreasing
		for(int i = 0; i < userNum; i++) 	
		{
			for(int j = userNum - 1; j > i; j--) 
			
			{
				
				System.out.print("♠");				
										
			}
			
			System.out.println();
							
		}
		
		sc.close();	
		
	}
	

}
