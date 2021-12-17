package constructor;

public class Webtoon {
	
	public String name;
	public int series;
	public String painter;
	public boolean complete;
	
	public Webtoon(String wName,String wPainter) {	
		
		name = wName;
				
		series = 1;
		
		painter = wPainter;
		
		complete = false;
		
	}
	
	// 웹툰 정보 안내하기
	public void getInfo() {
			
		System.out.println("제목은 : " + name + ", 회차는 : " + series + ", 작가는 : " + painter + ", 완결여부는 : " + complete );
					
	}
	
	// 웹툰 업로드하기
	public void uploadWebtoon() {
		
		series += 1;
		
		
	}
	
	// 웹툰 완결지식
	public void completeWebtoon() {
		
		complete = true;
		
	}
	

}
