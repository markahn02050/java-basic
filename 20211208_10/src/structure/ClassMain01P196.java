package structure;

public class ClassMain01P196 {
	// PersonClass의 메서드는 작성할 필요가 없다.

	public static void main(String[] args) {
		// 사람을 두 명 만들어보세요.
		
		PersonClass p1 = new PersonClass();
		
		PersonClass p2 = new PersonClass();
		
		p1.name = "Boy";
		p1.gender = "Male";
		p1.age = 24;
		p1.height = 180;
		p1.job = "Software Developer";
		
		p2.name = "Girl";
		p2.gender = "Female";
		p2.age = 25;
		p2.height = 160;
		p2.job = "Teacher";
		
		
		// 만든 사람 두 명의 정보를 콘솔에 찍어보세요.
		
		p1.getInfo();
		
		p2.getInfo();
		

	}

}
