package bjquiz;

import java.util.Scanner;

public class quiz1020 {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int q,d,n,p;
		int times = sc.nextInt();
		
		for (int i = 0; i<times; i++) {
			int money = sc.nextInt();
			q = money/25;
			d = (money-q*25)/10;
			n = (money-q*25-d*10)/5;
			p = (money-q*25-d*10-n*5)/1;
			System.out.println(q+" "+d+" "+n+" "+p);
			
		}
	}
}
