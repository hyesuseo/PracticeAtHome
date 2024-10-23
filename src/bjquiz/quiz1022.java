package bjquiz;

import java.util.Scanner;

public class quiz1022 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int times = sc.nextInt();
		int calHour=0, calMin=0;
		int value;
		int rest= (min+times)%60;;
		
		while(rest <60) {
			value = times/60;
			calHour++;
		}
		
		if (hour <23) {
			
		
		}else if(hour ==23) {
			
		}
		
		System.out.println(calHour+" "+calMin);
		
	}

}
