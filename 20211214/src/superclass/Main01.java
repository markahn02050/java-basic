package superclass;

public class Main01 {

	public static void main(String[] args) {
		// 비행기를 생성해서 초기속도는 300으로 세팅해주시고
		// 가속 2번으로 900으로 속도를 만들어주신다음
		// 0까지 내려주세요.
		
		Airplane ap1 = new Airplane(300);
		
		ap1.fly();
		ap1.fly();
		
		for(int i = 0; i < 9; i++) {
			
			ap1.breakSpeed();
			
		}
		

	}

}
