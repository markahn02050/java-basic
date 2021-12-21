package abstract1;

public abstract class Parent {
	
	// 추상 클래스
	// abstract선언이 붙은 클래스는 new를 이용합니다
	// 직접적 객체 생성은 불가능하고 상속만 가능합니다.
	private int age;
	
	public Parent() {
		
		this.age = 40;
		
	}
	
	// 추상 메서드, 아래와 같이 실행문 없이 선언부만 작성한다
	// 실행문이 없어서 오버라이딩이 강요됩니다.
	public abstract void getAge();
	
	
	// 추상 클래스 내부의 일반 메서드는 그냥 평범하게 작성합니다.
	public void getInfo() {
		
		System.out.println("일반메서드입니다.");
		
	}

}
