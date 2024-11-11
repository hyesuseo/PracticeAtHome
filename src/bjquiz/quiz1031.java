package bjquiz;

import java.util.HashMap;
import java.util.Scanner;

public class quiz1031 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		
		long max =0;
		String maxkey=null;
		
		for(int i = 0; i<times; i++) {
			int school = sc.nextInt();
		for (int j =0; j<school; j++) {
			HashMap<String, Long> alcoholic = new HashMap<String, Long>();
			String sk = sc.next();
			long zzan = sc.nextLong();
			alcoholic.put(sk, zzan);
		
		for (String key: alcoholic.keySet()) {
			long value = alcoholic.get(key);
			if(value > max) {
				max = value;
				maxkey = key;
			}
		}
			
		}System.out.println(maxkey);
		}
		
	}
}
