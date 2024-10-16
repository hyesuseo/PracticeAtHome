package bjquiz;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class quiz1016 {
	private static int times;
	public static void main(String[] args) throws Exception {
		
		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<Integer> times = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int many = sc.nextInt();
		
		for (int i = 0 ; i<many; i++) {
		times.add(sc.nextInt());
		String str = sc.next();		
			for (int j = 0; j<str.length(); j++)
			arr.add(j, Character.toString(str.charAt(j)));
			System.out.println(arr);
		}
		for (int a =0; a<arr.size(); a++) {
			for (int j =0; j<times.indexOf(j); j++) {
				System.out.print(arr.get(j));
		}
	}
}
}
