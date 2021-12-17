package thiskeyword;

public class Person {
	// 사람의 정보를 여기 기입합니다.
	private String name;
	private int age;
	private int money;
	private String major;
	
	
	public Person(String name, int age, int money, String major) {
		
		this.name = name;
		this.age = age;
		this.money = money;
		this.major = major;		
	
	}
	
	public void getInfo() {
		
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + age);
		System.out.println("돈 : " + this.money);
		System.out.println("전공 : " + major);
		
	}
	
	

}
