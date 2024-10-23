package bjquiz;

import java.util.Scanner;

public class quiz1023_2 {
	public static void main(String[] args) {
		
		int m, sleep, up, day;
		Scanner sc = new Scanner(System.in);
		
		up = sc.nextInt();
		sleep =sc.nextInt();
		m = sc.nextInt();
		
		//(up-sleep)day 가 올라갈 수 있는 높이
		//if up*day>=m이면 멈춘다
		day = ((m-sleep) / (up-sleep));
		
		if((m-sleep)%(up-sleep)!=0) {
			day ++;
		}
		System.out.println(day);
	}
}
