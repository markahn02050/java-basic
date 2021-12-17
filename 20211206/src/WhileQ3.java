import java.util.Scanner;

public class WhileQ3 {

	public static void main(String[] args) {
		// ForQ5P118을 while문을 사용하는 로직으로 고쳐보세요.
		// i, j변수, 조건식, 증감식 부분을 잘 신경써서 옮겨주세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("한 변의 너비를 입력해주세요.");
		
		int count = scan.nextInt();
		
		
		// i 반복문 영역
		int i = 0;
		
		while(i < count) {
			
			// j 반복문 영역
			int j = 0;
			while(j < count) {
				
				System.out.print("*");
				j++;
			}// j 반복문 끝
			
			System.out.println();
			i++;		
			
		}// i 반복문 끝

		
		
		

	}

}
