package hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		
		HashMap<Integer, String> memo = new HashMap<Integer, String>();
		Scanner sc= new Scanner (System.in);
		
		for(int i = 0 ; i<5; i++) {
		int a = sc.nextInt();
		String b = sc.next();
		memo.put(a, b);
		}
		System.out.println(memo.keySet());
		System.out.println(memo.values());
		
		Collection<String> set = memo.values();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
