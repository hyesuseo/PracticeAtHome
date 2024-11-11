package bjquiz;

import java.util.Scanner;

public class quiz1106 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int basket = sc.nextInt();
		int times = sc.nextInt();
		int buffer=0;
		int arr[] = new int [basket];
		
		for(int i =0; i<basket; i++) {
			arr[i]=i+1;
		}
		
		for(int i =0; i<times; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			
			if((to-from)==1) {
				for(int j=0; j<1; j++) {
					buffer = arr[from-1];
					arr[from-1] = arr[to-1];
					arr[to-1] = buffer;
				}
				
			}else {
				for(int j =0; j<(to-from+1)/2; j++) {
					buffer = arr[from-1+j];
					arr	[from+j-1] = arr[to-j-1];
					arr[to-j-1] = buffer;
					
				}
			}
			
			}
			
		for (int j =0; j<basket; j++) {
			System.out.println(arr[j]);
		}
		
		
	}
}
