package overriding;

public class Tiger extends Animal {
	
	boolean claw;
	
	
	
	
	// Overridden method
	public void howl() {		
		
		System.out.println("어흥");
		
		
	}
	
	public void getInfo() {
		
		
		System.out.println("동물의 이름: " + name + ", 나이 : " + age + ", 키 : " + height + ", 몸무게 : " + weight + ", 발톱의 유무: " + claw);
		
		
	}
	
	

}
