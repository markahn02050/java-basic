
public class Array01 {

	public static void main(String[] args) {
		
		String str = "asdfasdf.asdfasdfg.ddddd";
		
		
		// .을 split하기 위해선 char형으로만 가능
		// String형 자체에서 .을 split 하려면 역슬래쉬(\)를 두개 사용함 => \\
		String[] arr = str.split("\\.");
		
		System.out.println(arr[0]);
		
		
		
		

	}

}
