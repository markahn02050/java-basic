
public class Equation {

	public static void main(String[] args) {
		// 중첩 반복문을 이용해서
		// 다음 방정식의 양의 정수
		// 해를 모두 구하세요.
		// 4x + 5y = 60
		
		//int xCounter = 1;
				
		//int yCounter = 1;
		
		//int equationCal = (xCounter * 4) + (yCounter * 5);
			
		for(int xCounter = 1; (xCounter * 4) < 60; xCounter++){
				
			for(int yCounter = 1; (yCounter * 5) < 60; yCounter++) {	
				
				int equationCal = (xCounter * 4) + (yCounter * 5);
				
				if(equationCal == 60) {
						
					System.out.println("다음 방정식의 양의 정수의 해는 " + "X = " + xCounter+ ", Y = " + yCounter);				
						
				}
								
					
			}	
			
	}

								
			
	
}

}
