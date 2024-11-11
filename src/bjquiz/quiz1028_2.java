package bjquiz;

import java.util.Scanner;

public class quiz1028_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc. nextInt();
		String b;
		int c, e=0, times=0;
		int [] arr = new int [2]; 
		
		while(a!=e) {
			if (a<10) {
				arr[0] =0;
				arr[1] =a;
			}else if(a>10) {
				c = a/10;
				arr[0] = c;
				arr[1] = a -(c*10);
			}
			e= arr[0] + arr[1];
			
			
			times++;
			break;
		}
			
		System.out.println(times);
	}
}
