
public class ForQ4P117 {

	public static void main(String[] args) {
		// 구구단 2~9단까지 모두를 출력하는 코드를 작성해주세요.
		// 구구단은 2 ~ 9단까지 출력하면 됩니다.
		// 중첩 반복문을 사용해서 작성해 주세요.
		// 바깥쪽 반복문은 (int i)는 2~9까지 반복하게 해주시고
		// 안쪽 반복문은 (int j)1~9까지 반복하게 해주세요.
		// i * j를 출력하게 하면 됩니다.	
		
		// Showing result of the multiplication.
		int result;
		
		System.out.println("(1919단)구구단을 출력하는 알고리즘입니다.");
		
		// A Variable "i", A * B = C ---> Means "A" among the equation.
		for(int i = 2; i <= 19; i++) {		
			
			// A Variable "j", A * B = C ---> Means "B" among the equation.
			for(int j = 1; j <= 19; j++) {
				
				
				result = i * j;
				
				// Print out the result of calculation.
				System.out.println(i +" X "+ j +" = " + result);		
				
			}
			
			// Give an information when the calculation of unit has done.
			System.out.println("=====" + i + "단 출력완료=====");		
			
		}
		
		System.out.println("알고리즘을 종료합니다.");		

	}

}
