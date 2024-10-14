package bjquiz;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz1014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		ArrayList<String> key = new ArrayList<String>();
		
		for (int i =0; i<word.length(); i++) { //key 배열에 저장
		
		key.add(Character.toString(word.charAt(i)));
		}
		
		for (int i =97; i<=122; i++ )
		{ char letter =(char)i;
		
			if (key.contains(Character.toString(letter))) {
				
					System.out.println(key.indexOf(Character.toString(letter)));
			}else {
			System.out.println("-1");
			}
			
		}
	}
}


