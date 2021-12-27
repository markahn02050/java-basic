package arrays1;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// 이진 탐색(binary search)은 탐색알고리즘 중
		// 상위권의 성능을 보여주는 알고리즘입니다.
		// 다만, 실행에 앞선 전제조건으로
		// 1. 배열 내부에 중복되는 값이 없을것
		// 2. 배열이 오름차순(작은 숫자일수록 0번 인덱스에 가깝게)이어야함.
		
		// 정렬이 안 된 상태의 배열 내부를 탐색할 때는 찾지 못함.
		int[] arr = {5, 7, 6, 1, 3, 9, 0, 12};
		
        int minIndex = 0; //가장 적은 원소의 인덱스
        
        for(int i=0; i < arr.length; i++){
            for(int j=i+1 ; j < arr.length; j++){
                if(arr[minIndex] > arr[j])
                    minIndex = j;
            }
            
            //스와프
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        System.out.println(Arrays.toString(arr));
		
			
		// 이진탐색 수행 명령어 : Arrays.binarySearch(배열명, 찾는값);
		int a = Arrays.binarySearch(arr, 0);
		System.out.println(a);

	}

}
