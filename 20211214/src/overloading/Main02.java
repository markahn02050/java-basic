package overloading;

public class Main02 {

	public static void main(String[] args) {
		// 알바생 둘을 만들어주세요.
		// 하나는 시급을 15000원으로 해 주시고
		// 다른 하나는 입력 없이 생성해주세요.
		Parttimer pt1 = new Parttimer(true, 15000, "공차", "아이유");
		
		Parttimer pt2 = new Parttimer(false, "맥도날드", "로날드");
		
		Parttimer pt3 = new Parttimer(true, 8719, "버거킹", "burger");
		

	}

}
