package overriding;

public class Animal {
	
	public String name;
	
	public int age;
	
	public double weight;
	
	public double height;
	
	public void howl() {	
		
		System.out.println("동물이 웁니다.");
		
		
	}
	
	public void getInfo() {
		
		
		System.out.println("동물의 이름: " + name + ", 나이 : " + age + ", 키 : " + height + ", 몸무게 : " + weight);
		
		
	}
	
	
	
	
	

}
