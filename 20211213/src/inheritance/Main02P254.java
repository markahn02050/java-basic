package inheritance;

public class Main02P254 {

	public static void main(String[] args) {
		// 여기에 학생 하나와 샐러리맨 하나를 임의로 만들어보세요.
		// 샐러리맨에는 본인 이름과 희망 연봉을 적어주세요.
		// 학생은 그냥 알아서 작성해주세요.
		
		Student s1 = new Student();
		s1.name = "학생1";
		s1.age = 23;
		s1.stuNum = 1004;
		s1.getInfo();
		s1.getStudentInfo();
		
		Salaryman sm1 = new Salaryman();
		sm1.name = "안해찬";
		sm1.age = 22;
		sm1.salary = 50000000;
		sm1.getInfo();
		sm1.getSalaryInfo();
		

		
		
		
		

	}

}
