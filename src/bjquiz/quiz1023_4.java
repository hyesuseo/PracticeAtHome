package bjquiz;

import java.util.Scanner;

public class quiz1023_4 {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int arr [] = new int [3];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		int money, same, max;
		
		for (int i =0; i<2; i++)
		{
			if(arr[i] == arr[i+1]) {
				same = arr[i];
			}else if(arr[i]>arr[i+1]){
				max = arr[i];
				
			}
			
		}
		
	}
}
