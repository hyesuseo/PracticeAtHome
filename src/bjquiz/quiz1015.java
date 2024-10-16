package bjquiz;

import java.util.Scanner;

public class quiz1015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String word = sc.next();
		
		int leng = word.length();
		
		
		boolean j=true;
		String [] arr = new String [leng];
		for (int i =0; i<leng; i++) {
			arr[i]=Character.toString(word.charAt(i));				
		}
		
		if(leng%2 ==0) {
			for(int i =0; i<leng/2; i++) {
				if (!arr[i].equals(arr[leng-1-i])) {
					j = false; break;
				}else {
					j = true;
				}
				
			}
		}
		else if(leng%2==1) {
			for(int i =0; i<=(leng-1)/2; i++) {
				if (!arr[i].equals(arr[leng-1-i])) {
					j = false; break;
				}else {
					j = true;
				}
			}
		}
		
		
		
		if (j == true) {
			System.out.println("1");
		}else if (j ==false) {
			System.out.println("0");
		}
		
		
		
	}

}
