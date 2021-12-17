package structure;

public class Structure02P190 {
	
	// Person 내부의 정보를 쉽게 조회하기 위한 메서드 생성
	public static void getInfo(Person p) {
		
		System.out.println(p.name + "의 정보입니다.");		
		System.out.println("이름 : " + p.name + ", 나이 : " + p.age + "연락처 : " + p.pNum + ", 번호 : " + p.uNum);		
		
	}

	public static void main(String[] args) {
		// 사람을 두 명 만들어보세요(a, b)
		
		Person a = new Person();
		
		Person b = new Person();

		a.name = "안해찬";		
		System.out.println(a.name);
		
		a.age = 23;
		System.out.println(a.age);
		
		a.pNum = "01012345671";
		System.out.println(a.pNum);
		
		a.uNum = 1230975;
		System.out.println(a.uNum);
		
		
		b.name = "안해챤";		
		System.out.println(b.name);
		
		b.age = 23;
		System.out.println(b.age);
		
		b.pNum = "01044225671";
		System.out.println(b.pNum);
		
		b.uNum = 1214275;
		System.out.println(b.uNum);		
		
		getInfo(a);
		getInfo(b);

	}

}
