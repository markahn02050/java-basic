package polymorphism;

public class Main01 {

	public static void main(String[] args) {
		// 부모타입인 Person으로 자식은 Student까지 받을 수 있음.
		Person p1 = new Person("나사람", 10);
		Person s1 = new Student("나학생", 20, 100);
		
		// p1과 s1의ㅏ showPerson은 다르게 돌아갑니다.
		p1.showPerson(); // Person측 showPerson()호출
		s1.showPerson(); // Student측 showPerson()호출
		
		Person s2 = new Student("학생2", 25, 99);
		Person p2 = new Person("사람2", 15);
		p2.showPerson();
		s2.showPerson(); 
		
		Student s3 = new Student("학생3", 21, 85);
		s3.showStudent();
	}

}
