package bjquiz;

import java.util.Scanner;

public class quiz1104 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int num[] = new int[6];
		
		for(int i =0; i<num.length; i++) {
			int a=(int)(Math.random()*45+1);
			
			if(num.equals(a)) {
				a =(int)(Math.random()*45+1);
			}
			num[i] = a;
		}
		for (int i =0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
	}
}
