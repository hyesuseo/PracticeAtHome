package bjquiz;

import java.util.Scanner;

public class quiz1107 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int need = 1500-a;
		int day = need/100;
		
		System.out.println(day);
	}
}
