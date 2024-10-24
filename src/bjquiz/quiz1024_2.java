package bjquiz;

import java.util.Scanner;

public class quiz1024_2 {
	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		int a, b, c, mul;
		int zero=0, one=0, two=0, three=0, four=0, five=0, six=0, seven=0, eight=0, nine=0;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		mul = a*b*c; //곱한 값
		
		String numberStr = String.valueOf(mul);
		int arr [] = new int [numberStr.length()];
		
		for(int i =0; i<numberStr.length(); i++) {
			char digitChar = numberStr.charAt(i);
			arr[i] = Character.getNumericValue(digitChar);
			
		}
		
		for(int i =0; i<numberStr.length(); i++) {
			if(arr[i]==0){
				zero++;
			}else if(arr[i]==1){
				one++;
			}else if(arr[i]==2){
				two++;
			}else if(arr[i]==3){
				three++;
			}else if(arr[i]==4){
				four++;
			}else if(arr[i]==5){
				five++;
			}else if(arr[i]==6){
				six++;
			}else if(arr[i]==7){
				seven++;
			}else if(arr[i]==8){
				eight++;
			}else if(arr[i]==9){
				nine++;
			}
	
		}
		System.out.println(zero);
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);
		System.out.println(seven);
		System.out.println(eight);
		System.out.println(nine);
}
}
