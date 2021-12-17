package polymorphism;

// 부모클래스 Person으로 가지도록 상속을 해주세요.
public class Student extends Person{
	
	// 학생의 등급인 grade를 선언합니다.
	private int grade;
	
	// super()를 이용해 Person(부모)생성자까지 커버하는 생성자를 만들어주세요.
	public Student(String name, int age, int grade) {
		
		super(name, age);		
		
		this.grade = grade;
		
	}
	
	// 상속받은 showPerson을 활용한 메서드를 작성합니다.
	public void showPerson() {
		// 부모쪽 showPerson() 호출
		super.showPerson();
		System.out.println("학점: " + grade);
		
		
	}
	
	public void showStudent() {
	
		System.out.println("저는 학생입니다.");
	}
	

}
