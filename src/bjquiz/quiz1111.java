package bjquiz;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class quiz1111 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int times = sc.nextInt();
		int arr [] = new int [times];
		int smaller;
		for (int i=0; i<times; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);	
		
		for( int i =0; i<times; i++) {
			System.out.println(arr[i]);
		}

	}

}
