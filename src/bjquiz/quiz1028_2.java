package bjquiz;

import java.util.Scanner;

public class quiz1028_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc. nextInt();
		String b;
		int c,d, e=0, times=0;
		int [] arr = new int [2]; 
		if (a<10) {
			arr[0] = 0;
			arr[1] = a;
		}else if (a>10) {
			c = a/10;
			arr[0] = c;
			arr[1] = a -(c*10);
		}
		while(a!=e) {
			b = String.valueOf(arr[0])+String.valueOf(arr[1]);
			e = Integer.parseInt(b);
			if (e<10) {
				arr[0] = 0;
				arr[1] = e;
			}else if (e>10) {
				c = e/10;
				arr[0] = e/10;
				arr[1] = e -(c*1);
			}	
			times ++;
			}
			
		System.out.println(times);
	}
}
