package polymorphism;

public class Main02 {

	public static void main(String[] args) {

		Doctor d1 = new Doctor("의사1", 40, "아산병원");
		
		Teacher t1 = new Teacher("선생님1,", 30, "XX초등학교");
		
		d1.showPerson();
		d1.showDoctor();
		t1.showPerson();
		t1.showTeacher();
		
		
		

	}

}
