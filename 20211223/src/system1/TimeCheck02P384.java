package system1;

public class TimeCheck02P384 {

	public static void main(String[] args) {
		// try~catch구문의 소요시간을 구해주세요.
		// 내부에는 여러분들이 원하는 속서으이 예외를 발생시키세요.
		// throw로 발생시키면 됩니다.
		
		long start = System.currentTimeMillis();
		
		int newRandom = (int)(Math.random() * 10);

		System.out.println("나온 난수값: " + newRandom);
		
		
		try {
			
			if(newRandom >= 5) {
				
				throw new ArithmeticException();
			}
			
			else {
				
				System.out.println("오류없이 정상적으로 난수 생성");
			}
			
		}
		
		catch(Exception e) {
			
			System.out.println("예외를 만들었습니다.");
			
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("끝난시간 : " + end);
		System.out.println("소요시간 : " + (end - start));

		

	}

}
