package bjquiz;

import java.util.Scanner;

public class quiz1022 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int times = sc.nextInt();
		int calHour=0, calMin=0;
		int value = (min+times)/60;
		int rest = (min+times)%60;
		
		if (hour <23) {
			if((min+times)>=60) {
				calHour = hour +value;
				calMin = (min+times)-60 +rest;
			}else if((min+times)<60) {
				calHour = hour;
				calMin = min+times;
			}
		}else if(hour ==23) {
			if((min+times)>=60) {
				calHour =0;
				calMin = (min+times)-60;
			}else if((min+times)<60) {
				calHour = hour;
				calMin = min+times;
			}
		}
		if(calMin ==60) {
			calMin = 00;
		}
		System.out.println(calHour+" "+calMin);
		
	}

}
