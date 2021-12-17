import java.util.Scanner;
public class WhileQ3P112 {

	public static void main(String[] args) {
		// While문을 이용해 구구단 만들기
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("2~9사이의 구구단을 입력해주세요.");
		
		int newDan = scan.nextInt();
		
		int result;
		
		int numCount = 1;
				
		do {
					
			result = newDan * numCount;
					
			if(numCount >= 1 && numCount < 10)
			{
				
				System.out.println(newDan + " X " + numCount + " = " + result );
				
				numCount += 1;					
				
			}		
			
			
			}
		
		while(newDan > 1 && newDan < 10);
		
		System.out.println("구구단의 유효 범위는 2~9단입니다");
		
	}

}
