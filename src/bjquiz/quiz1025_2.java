package bjquiz;

import java.math.BigInteger;
import java.util.Scanner;

public class quiz1025_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		BigInteger mul=BigInteger.ONE;
		a = sc.nextInt();
		
		if (a ==0) {
			System.out.println(1);
		}else {
			for(int i=1; i<=a; i++) {
				mul = mul.multiply(BigInteger.valueOf(i));
			}
			System.out.println(mul);
		}
	}
}
