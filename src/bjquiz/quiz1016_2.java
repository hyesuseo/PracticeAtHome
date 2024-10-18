package bjquiz;

import java.util.Scanner;

public class quiz1016_2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num, times;
		String str; 
		
		num = sc.nextInt();
		
		
		for (int i = 0; i<num; i++) {
			times= sc.nextInt();
			
			
			str = sc.next();		
			String arr[] = new String [str.length()];
			for (int j =0; j<str.length(); j++) {
			arr[j] = Character.toString(str.charAt(j));
			}
			for (int l =0; l<str.length(); l++) {
				for(int k = 0; k<times; k++)
				System.out.print(arr[l]);
			}	System.out.println();
			
		}
	}
}
