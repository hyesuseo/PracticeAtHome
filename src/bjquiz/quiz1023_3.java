package bjquiz;

import java.util.Scanner;

public class quiz1023_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int times;
		double avg,max=0, sum=0;
		times= sc.nextInt();
		double arr[] = new double [times];
		double narr[] = new double [times];
		
		for(int i=0; i<times; i++) {
			arr[i]=sc.nextInt();
				if(arr[i]>max) {
					max = arr[i];
				}
		}		
		for (int i =0; i<times ;i++) {
			
			narr[i]=arr[i]/(double)max*100;
			sum += narr[i];	
		}	
		avg = sum/times;
		System.out.println(avg);

	
		
	}
}
