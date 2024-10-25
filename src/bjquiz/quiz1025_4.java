package bjquiz;


import java.util.Scanner;

public class quiz1025_4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n ==0) {
			System.out.println(0);
		}else if(n==1) {
			System.out.println(1);
		}else {
			int a=0; 
			int [] arr = new int [n];
				arr[0]=0;
				arr[1]=1;
			for(int i =2; i<n; i++) {
				arr[i] = arr[i-2]+arr[i-1];
				
			}
				System.out.println(arr[n-1]);
			}
			
		}
		
}
