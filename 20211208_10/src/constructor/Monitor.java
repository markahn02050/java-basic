package constructor;

public class Monitor {
	
	public int hz;
	public double inch;
	public String company;
	public int price;
	
	public void onMonitor() {
		
		System.out.println("모니터를 켭니다.");
		
	}
	
	public void offMonitor() {
		
		System.out.println("모니터를 끕니다.");		
		
	}
	
	public void modifySize() {
		
		
		System.out.println("모니터의 해상도를 조절합니다.");
		
	}
	


}
