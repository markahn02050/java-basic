package random1;

import java.util.Random;

public class Random03P484 {

	public static void main(String[] args) {
		// Random 클래스의 nextInt()는 나올 숫자 범위를 지정할 수 있습니다.
		// 바로 정수로 나오기 때문에 코드가 좀 더 간결합니다.
		Random random = new Random();
		
		int result2 = random.nextInt(5);
		
		System.out.println(result2);

	}

}
