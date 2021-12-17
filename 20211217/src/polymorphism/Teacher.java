package polymorphism;

public class Teacher extends Person {
	
	private String school;
	
	public Teacher(String name, int age, String school) {
		
		super(name, age);
		this.school = school;
		
	}
	
	public void showPerson() {
		
		super.showPerson();
		System.out.println("선생님의 학교: " + school);	
		
	}
	
	public void showTeacher() {
		
		System.out.println("저는 선생님입니다.");
	}
	

}
