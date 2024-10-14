package bjquiz;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		int count = num/4;
		for(int i = 1 ; i <=count; i++) {
			System.out.print("long ");
		}
		
		System.out.println("int");

	}

}
