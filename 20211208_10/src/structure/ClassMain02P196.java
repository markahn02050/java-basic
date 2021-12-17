package structure;

public class ClassMain02P196 {

	public static void main(String[] args) {
		// main지역
		
		Car car1 = new Car();
		car1.model = "Ferrari";
		car1.price = 300000000;
		car1.owner = "David";
		
		Car car2 = new Car();
		car2.model = "Lamborghini";
		car2.price = 600000000;
		car2.owner = "Jason";
		
		car1.getCarInfo();
		
		car2.getCarInfo();		
		

	}

}
