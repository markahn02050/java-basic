import java.util.Scanner;

public class WhileQ5P119 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하면 그 숫자의 제곱만큼의 정사각형 넓이를 보여줍니다.");

		int userNum = scan.nextInt();
		
		System.out.println(userNum + "을(를) 입력받았습니다.");
			
		int height = 0;
		int width = 0;
		
		do {	
			
			do {
				
				System.out.print("* ");
				
				width += 1;
			
			}		
			while(width < userNum);
			
			// Reset width for calculating a next line.
			width = 0;
			
			// Change to a next line.
			height += 1;
			
			System.out.println();
											
			}
		// Escape the whole logic when it's done.
		while(height < userNum);	

	}

}
