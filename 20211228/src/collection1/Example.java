package collection1;

public class Example {

	private int a;
	private int b;
	
	
	public Example() {
		
		this.a = 1;
		
		this.b = 2;	
		
	}

	// System.out.println()
	// 오버라이딩된 toString()이 존재하면 주소값 대신 내부에 적힌게
	// 콘솔에 찍혀나옴
	@Override
	public String toString() {
		return "Example [a=" + a + ", b=" + b + "]";
	}
	
	
	
	
}
