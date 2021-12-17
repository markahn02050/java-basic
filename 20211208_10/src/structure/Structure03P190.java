package structure;

public class Structure03P190 {
	
	public static void getCatInfo(Cat c) {
		
		System.out.println(c.name + "의 정보입니다.");		
		System.out.println("이름 : " + c.name + ", 키 : " + c.height + "cm " +  " 나이 : " + c.age + "살");	
		
		
	}

	public static void main(String[] args) {
		// main
		
		Cat a = new Cat();
		
		Cat b = new Cat();
		
		a.name = "야옹이1";
		a.height = 50.03;
		a.age = 2;
		
		b.name = "야옹이2";
		b.height = 53;
		b.age = 5;
		
		getCatInfo(a);
		getCatInfo(b);
		

	}

}
