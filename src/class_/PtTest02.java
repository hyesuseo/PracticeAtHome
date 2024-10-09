package class_;

import java.util.Scanner;

public class PtTest02 {
	
	public int [] input() {
		int arr [] = new int [2];
		Scanner sc = new Scanner (System.in);
		System.out.print("첫번째 수를 입력: ");
		arr[0] = sc.nextInt();
		System.out.print("두번째 수를 입력: ");
		arr[1] = sc.nextInt();
		return arr;
	}
	public int bigger(int a, int b) {
		int max;
		if(a>b) {
			max = a;
		}else {
			max = b;
		}
		return max;
	}
	public void call(int max) {
		System.out.println("큰 수는 "+max);
	}
}
