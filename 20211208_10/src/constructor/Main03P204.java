package constructor;

public class Main03P204 {

	public static void main(String[] args) {
		// Webtoon main실행부
		
		Webtoon comic1 = new Webtoon("프리드로우", "전선욱");
		
		comic1.getInfo();
		comic1.uploadWebtoon();
		comic1.completeWebtoon();
		
		Webtoon comic2 = new Webtoon("연애혁명", "232");
		
		comic2.getInfo();
		comic2.uploadWebtoon();
		comic2.completeWebtoon();	
		

	}

}
