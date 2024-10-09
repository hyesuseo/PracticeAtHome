package class_;

import java.util.Scanner;

public class PtTest03 {
	public int input() {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("수를 입력: ");
		int a = sc.nextInt();
				
		return a;
	}
	//짝 홀 판별	
	public String douodd(int b) {
		String a=null;
		if (b%2 ==0) {
			a = "짝수";
		}else if (b%2==1) {
			a = "홀수";
		}
		return a;
	}
	//3의 배수인지 아닌지
	public String three(int num) {
		String a = null;
		if (num %3==0) {
			a = "3의 배수";
		}else {
			a = "3의 배수가 아님";
		}
		return a; 
	}
	//소수인지 아닌지
	
	public String prime (int a) {
		String prm=null;
		double dou = a;

		if (a<=1) {
			prm = "소수가 아님";
		}else if (a==2 || a==3 || a==5 || a==7) {
			prm = "소수";
		}else if (a %2 ==0) {
			prm = "소수";
		}
		else {
			int sqr = (int)Math.sqrt(dou);
			
			for (int i = 3; i<=sqr; i+=2) {
				if (a%i ==0) {
					prm="소수가 아님";
					break;
				}
			}
		}
		return prm;
	}
	
	//절대값 구하는 함수
	
	public int absolute (int a) {
		int ab;
		if (a <0 ) {
			ab = -1 * a;
		}else {
			ab = a;
		}
		return ab;
	}
	
	
	//String 프린트
	public void print (String a) {
		System.out.println("입력한 값은 "+a+"입니다.");
	}
	
	public void printint(int a) {
		System.out.println("절대값은 "+ a + "입니다.");
	}
	
}
