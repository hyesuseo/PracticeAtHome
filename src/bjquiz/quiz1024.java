package bjquiz;

import java.util.Scanner;

public class quiz1024 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		int j=0;
		//times만큼 입력받는다 times만큼 늘어나니까 arr[] 사용
				//for문 안에서 평균을 구한다.
				//평균을 넘으면 over 값을 ++해주고,
				//over를 people로 나눠준다
		
		while(j<times) {
			int people = sc.nextInt();
			double arr[] = new double [people];
		
			double sum =0, avg=0, over=0, percent=0;
			for(int i = 0; i<people; i++) {
		
				arr[i]=sc.nextInt();
				sum += arr[i];		
			}	avg = (double)sum /people;
			
			for (int i =0; i<people; i++) {
				if(arr[i]>avg) {
					over++;
				}
			} 
			percent= (over/people) *100;
			j++;
			System.out.printf("%.3f%%\n",percent);
		}
		
	}
}
