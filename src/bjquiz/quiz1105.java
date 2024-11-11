package bjquiz;

import java.util.Scanner;

public class quiz1105 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int remains[] = new int [42];
		int count=0;
		
		for (int i =0; i<10; i++) {
			int value = sc.nextInt();
			int a = value%42;
			if(a==0) {
				remains[a]=43;
			}else {
			remains[a] = a;
			}
		}
		for(int i =0; i<42; i++) {
			if(remains[i]!=0) {
				count++;
			}
		}System.out.println(count);
		
		
	}
}
