package bjquiz;

import java.util.Scanner;

public class quiz1023 {

	public static void main(String[] args) {
		int hour, min, times; 
		int plushours=0;
		int rshour=0, rsmin=0;
		
		Scanner sc= new Scanner(System.in);
		hour = sc.nextInt();
		min = sc.nextInt();
		times = sc.nextInt();
		
		while(times%60<60) {
			plushours = times/60;
			times= times -plushours*60; //시간을 60으로 나눈 몫
			if(times<60) { //times는 그 나머지시간
				break;
			}
		}
		//System.out.println(times +" :"+ plushours);
		
		if ((min + times)>=60){
			rshour = hour+1+plushours;
			rsmin = (min+times)-60;
			if(rsmin ==60) {
				rsmin=00;
			}
			if(rshour ==24) {
				rshour=0;
			}else if (rshour>24) {
				rshour= rshour-24;
			}
		}
		else if ((min+times)<60){
			rshour = hour + plushours;
			rsmin= min+times;
			if(rsmin ==60) {
				rsmin=00;
			}
			if(rshour ==24) {
				rshour=0;
			}else if (rshour>24) {
				rshour= rshour-24;
			}
			
		}
		
		System.out.println(rshour+" "+rsmin);
		
	}

}
