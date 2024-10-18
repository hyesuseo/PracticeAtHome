package bjquiz;

import java.util.Scanner;

public class quiz1018 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num, a, b;
		
		num = sc.nextInt();
		for(int i =0; i<num; i++) {
			
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Case #"+(i+1)+": "+ a+" + "+b+" = "+ (a+b));
		}
	}
}
