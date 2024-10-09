package class_;

import java.util.Scanner;

public class PtMain02 {

	public static void main(String[] args) {
		
		
		PtTest02 test = new PtTest02();
		// 두 수를 입력받기
		int []arr = test.input();
		
		//큰 수를 선택하기(비교)
		int max = test.bigger((int)arr[0], (int)arr[1]);
		
		// 큰 수를 출력하기
		test.call(max);
	}

}
