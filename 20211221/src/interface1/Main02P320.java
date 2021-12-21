package interface1;

public class Main02P320 {

	public static void main(String[] args) {
		// Main Function
		
		Vehicle t1 = new Train("안해찬");
		
		
		t1.showStatus();
		t1.accel();
		t1.accel();
		t1.showStatus();		
		
		t1.accel();
		t1.breakSpeed();
		t1.breakSpeed();
		t1.showStatus();
		
		t1.reFuel();
		t1.accel();
		t1.accel();
		t1.showStatus();
		
	}

}
