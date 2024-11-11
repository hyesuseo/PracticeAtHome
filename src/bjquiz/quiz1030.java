package bjquiz;

import java.util.Scanner;

public class quiz1030 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count =0;
		int [] arr = new int [N];		
		
		for(int i =0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		if (N ==1) {
			count =1;
		}else if (N>=2) {
			for (int i =0 ; i<N+1; i++) {
				if (arr[i]<arr[i+1]) {
					count ++;
				}else if (arr[i]==arr[i+1]) {
					
				}	
			}	
	
		}
		
		System.out.println(count);	
}
}