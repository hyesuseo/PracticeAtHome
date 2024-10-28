package bjquiz;

import java.util.Scanner;

public class quiz1028 {
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		int a,b,c, max=0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a==b && b==c) {
			System.out.println(10000+a*1000);
		}else if ((a==b && b!=c)||(a==c && a!=b)||(b==c && a!=b)) {
			if(a==b) {
				System.out.println(1000+a*100);
			}else if(b==c) {
				System.out.println(1000+b*100);
			}else if (c==a) {
				System.out.println(1000+a*100);
			}
		}else if (a!=b && b!=c) {
				if(a>b) {
					max = a;
					if(a>c) {
						max =a;
					}else if(a<c) {
						max = c;
					}
				}else if(b>a) {
					max = b;
					if(b>c) {
						max =b;
					}else if(b<c) {
						max = c;
					}
				}
			System.out.println(max*100);
		}
	}
}
