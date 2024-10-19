package bjquiz;

import java.util.Scanner;

public class quiz1019 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		int num1 = sc.nextInt();
		String num1toS = String.valueOf(num1);

		int num2 = sc.nextInt();
		String num2toS = String.valueOf(num2);
		
		
		String [] a = new String [3];
		String [] are = new String [3];
		for (int i =0; i<3; i++) {
			a[i] = Character.toString(num1toS.charAt(i));
			are[i] = a[2-i];
		}
		System.out.println(are[0]+are[1]+are[2]);
		String [] b = new String [3];
		String [] bre= new String [3];
		for (int i =0; i<3; i++) {
			b[i] = Character.toString(num2toS.charAt(i));
			bre[i] = b[2-i];
		}
		
		
}
}
