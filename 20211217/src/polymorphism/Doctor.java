package polymorphism;

public class Doctor extends Person{
	
	private String hospital;
	
	public Doctor(String name, int age, String hospital) {
		
		super(name, age);
		this.hospital = hospital;
	}
	
	public void showPerson() {
		
		super.showPerson();
		System.out.println("의사의 병원: " + hospital);	
		
	}
	
	public void showDoctor() {
		
		System.out.println("저는 의사입니다.");
	}
	
	

}
