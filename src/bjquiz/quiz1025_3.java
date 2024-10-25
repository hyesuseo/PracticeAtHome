package bjquiz;

import java.util.Scanner;

public class quiz1025_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, aa, bb, max=0 ;
		a = sc.nextInt();
		b = sc.nextInt();
		String numStra = Integer.toString(a);
		String numStrb = Integer.toString(b);
		int [] arra = new int [3];
		int [] rea = new int [3];
		int [] arrb = new int [3];
		int [] reb = new int [3];
		for (int i = 0 ; i<3; i++) {
			arra[i] = Character.getNumericValue(numStra.charAt(i));
			arrb[i] = Character.getNumericValue(numStrb.charAt(i));
		}
		for (int i =0; i<3; i++) {
			rea [2-i] = arra[i];
			reb [2-i] = arrb[i];
		}
		
		aa = rea[0]*100 + rea[1]*10 + rea[2]*1;
		bb = reb[0]*100 + reb[1]*10 + reb[2]*1;
		
		if(aa>bb) {
			max = aa;
		}else if (aa<bb) {
			max = bb;
		}
		System.out.println(max);
		
		
		
		
		
		
		
	}
}
