package bjquiz;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz1101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		//int times = sc.nextInt();
		int people=0;
		
	
			
				
		
		//for (int i =0; i<times; i++) {
		int floor = sc.nextInt();
		int ho = sc.nextInt();
		int zeroFl [][] = new int [floor][ho];
			if (floor == 0) {
				for (int j = 1; j<=ho; j++) {
					zeroFl[0][j]=j+1;
				}
				
			}
			else if (floor !=0) {
				for( int j = 1; j<ho; j++) { //층들
					for (int k = 1; k<floor; k++) { //한 층의 호
						zeroFl[j][k] = zeroFl[j-1][k] + zeroFl[j][k-1];
					}
					
				}
			}
		
		System.out.println(zeroFl[floor][ho]);
		}
	//}

}
