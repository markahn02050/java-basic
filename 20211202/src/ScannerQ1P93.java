import java.util.Scanner;

public class ScannerQ1P93 {

	public static void main(String[] args) {
		// 환율 계산기를 만들어보겠습니다.
		// 네이버에 검색해서 원하는 국가 화폐의 환율을 rate 변수에 저장해주세요.
		// 스캐너를 이용해서 won 변수에 원화 금액을 입력해주세요.
		// 원화와 환율을 이용해서
		// 원화 xxxxx원을 환전시 xxxx(화폐)입니다. 로 결과물을 출력해주세요.
		
		double rate = 1177.30;
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println("네이버 기준 현재 US달러 환율: " + rate + "원");
		
		System.out.println("원화를 입력해주시면 US달러로 환전합니다: ");		
		int won = scan.nextInt();
		
		System.out.println("입력받은 원화: " + won + "원");
		
		double exchanged = won / rate;
		
		// won/rate를 Math.round()로 감싼다음, 10^n승을 곱하고 10.0^n승으로 나눠주면
		// n승에 해당하는 자릿수만큼 소수점자리까지만 나옵니다.
		double rounded = (Math.round(exchanged*100)) / 100.0;
		
		// 실수(double)형을 문자형으로 변환
		//String numString = Double.toString(rounded);도 같은 방법
		String numString = "" + rounded;
				
		// split을 이용하여 ex) 4.25 달러면 .을 분리
		String numArr[] = numString.split("\\.");
		
		// split한 몫 자리와 소수점 자리 숫자를 표현
		//달러
		String dollars = numArr[0];
		//센트
		String cents = numArr[1];		
		
		System.out.println("원화 " + won + "원을 환전시 " + dollars + "달러 " + cents +"센트입니다.");
	
		scan.close();

	}

}
