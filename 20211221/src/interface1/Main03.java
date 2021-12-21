package interface1;

public class Main03 {

	public static void main(String[] args) {
		// Main
		
		Vehicle a1 = new Airplane("안해찬");
		
		a1.showStatus();
		a1.accel();
		a1.accel();
		a1.showStatus();		
		
		a1.accel();
		a1.breakSpeed();
		a1.breakSpeed();
		a1.showStatus();
		
		a1.reFuel();
		a1.accel();
		a1.accel();
		a1.showStatus();
		

	}

}
