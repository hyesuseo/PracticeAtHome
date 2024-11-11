package bjquiz;

import java.util.Scanner;

public class quiz1111_02 {
	public static void main(String[] args) {
		int a = 1;
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		if (n==1) {
			System.out.println(1);
		}else {
			int i =1;
			while(n>a+6*i) {
				i++;
		}
		System.out.println(i);
			
		}
	}
}
