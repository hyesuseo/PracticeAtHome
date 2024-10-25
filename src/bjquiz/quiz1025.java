package bjquiz; //2839

import java.util.Scanner;

public class quiz1025 {

	public static void main(String[] args) {
		//N킬로그램 배달해야할때- 5킬로 봉지와 3킬로봉지
		//5의 배수이면 5로 나눈다= a
		//그외는 3으로 나눴을때 값 b
		//먼저 5로 나누고 남은 값을 3으로 나눈다  c + d
		//만약 나누어떨어지지 않는다면 -1을 출력한다
		int times=0, remain, min=0;
		boolean bool = true; //false이면 -1 출력
		int a=0, b=0, c=0, d=0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //N킬로그램 
		if (N==5) {
			a = 1;
		}else if (N==3) {
			b = 1;
		}else if(N%5==0 && N%3==0) {
			a = N/5;
			
		}else if(N%3==0) {
			b = N/3; //6
			
			c = N/5; //
			remain = N-5*c;
			
			if(remain%3==0) {
				d = remain/3;
				times = c+d;
			}else if(remain%3!=0) {
				bool= false;
			}
			
			if(b> times) {
				min = times;
			}else {
				min= b;
			}
			
		}
		else if(N%5!=0 && N%3!=0) {
			//1
			a=N/5;
			b=(N-a*5)/3;
			
			c= N/3;
			d = (N-c*3)/5;
			if(b%3!=0 || d%5!=0) {
				bool = false;
				}
			if(a+b>c+d) {
				min = c+d;
			}else {
				min = a+b;
			}
		}
		
		if (bool = false) {
			System.out.println(-1);
		}else if(N%5==0 && N%3==0) {
			System.out.println(a);
		}else {
			System.out.println(min);
		}
		
		

	}

}
