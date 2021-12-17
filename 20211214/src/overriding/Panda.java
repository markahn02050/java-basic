package overriding;

public class Panda extends Animal {
	
	int offspring;
	
	
	// Overridden method
	public void howl() {
		
		
		System.out.println("크왕");
		
		
	}
	
	public void getInfo() {
		
		
		System.out.println("동물의 이름: " + name + ", 나이 : " + age + ", 키 : " + height + ", 몸무게 : " + weight + ", 새끼곰 : " + offspring);
		
		
	}
	
	

}
