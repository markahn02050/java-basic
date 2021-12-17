import java.util.Scanner;

public class MethodQ1P204 {
	
	public static double FToC(double f) {
		
		double celcius = (f - 32) / 1.8;
		
		double roundUp = (Math.round(celcius*100)) / 100.00;
		
		return roundUp;
			
	}

	public static void main(String[] args) {
		// 화씨온도를 입력하면 섭씨온도로 바꿔주는 메서드를 작성해보겠습니다.
		// 메서드 이름은 FToC이고, double을 리턴합니다.
		// 리턴받은 결과값은 main메서드에서 sysout()으로 출력해주세요.
		// 화씨 = (섭씨 X 1.8) + 32
		// (화씨 - 32) / 1.8 = 섭씨
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("원하시는 F온도를 입력하시면 C온도로 바꿉니다.");
		
		double newF = scan.nextDouble();
		
		double resultC = FToC(newF);
		
		System.out.println("F온도는 " + resultC + " C입니다");
		
		
		scan.close();
	}
	

}
