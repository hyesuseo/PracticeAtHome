package class_;

import java.util.HashMap;

public class PtMain01 {

	public static void main(String[] args) {
		PtTest01 test = new PtTest01();
		
		//입력기능
		//String input = test.input();
		
		//출력기능
		//test.output(input);
		
		
		//이름 3개 입력 기능 - 배열 활용
		//String [] names = test.nameput();
		
		//이름 3개 출력 기능 - 배열 활용
		//test.namecall(names);
		

		//두 수를 입력
		//int numbers []= test.numbers();
		
		//두 수의 연산값
		//int rst=test.result(numbers[0], numbers[1]);
		
		
		//두 수의 출력
		//test.calls(rst);
		
		// 두 수의 입력 = 어레이 리스트
		//ArrayList arr = test.putarr();
		
		//int sum = test.plusarr((int)arr.get(0), (int)arr.get(1));
		
		//test.callcall(sum);
		//System.out.println(arr);
		
		HashMap <String, Integer> map =test.inputmap();
		
		int a = test.happ(map.get("key1"), map.get("key2"));
		
		test.print(a);
	}

}
