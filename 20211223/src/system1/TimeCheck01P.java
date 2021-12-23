package system1;

public class TimeCheck01P {
	
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		System.out.println("시작시간 : "  + start);
		
		
		long all = 0;
		
		for(int i = 0; i < 2000000001; i++) {
			
			all += i;
				
			
		}
		
		System.out.println("1부터 20억까지 다 더하면 : " + all);
		
		
		
		long end = System.currentTimeMillis();
		System.out.println("끝난시간 : " + end);
		System.out.println("소요시간 : " + (end - start));
	}

}
