package class_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PtTest01 {

	public String input(){
		Scanner sc= new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		return name;
	}
	
	public void output(String name) {
		System.out.println(name);
	}
	
	public String[] nameput() {
		String [] names = new String[3];
		Scanner sc= new Scanner (System.in);
		for (int i = 0; i<names.length ; i ++) {
			System.out.println("이름을 입력: ");
			names[i] = sc.next();
		}
		return names;
	}
	
	public void namecall(String [] call) {
		for(int i = 0; i<call.length; i++)
		System.out.println(call[i]);
	}
	
	public int [] numbers() {
		Scanner sc= new Scanner (System.in);
		int nums[] = new int [2];
		System.out.print("첫 번째 수 입력: ");
		int a = sc.nextInt();
		nums[0] = a;
		System.out.print("두 번째 수 입력: ");
		int b = sc.nextInt();
		nums[1] = b;
		
		return nums;
	}
	
	public int result(int a, int b) {
		int plus = a + b;
		return plus;
	}
	
	public void calls(int a) {
		System.out.println("출력된 값은 : "+a);
	}
	
	public ArrayList<Integer> putarr() {
		Scanner sc = new Scanner (System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.print("첫번째 수 입력: ");
		int a = sc.nextInt();
		arr.add(a);
		System.out.print("두번째 수 입력: ");
		int b = sc.nextInt();
		arr.add(b);
		return arr;
	}
	
	public int plusarr(int a, int b) {
		int sum = a + b;
		return sum;
		
	}
	
	public void callcall(int a) {
		System.out.println(a);
	}
	
	public HashMap<String, Integer> inputmap() {
		Scanner sc = new Scanner (System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		System.out.print("key1 : ");
		int a = sc.nextInt();
		map.put("key1", a);
		
		System.out.print("key2: ");
		int b = sc.nextInt();
		map.put("key2", b);
		
		return map;	
		
	}
	
	public int happ(int a, int b) {
		int sum = a + b;
		return sum;
		
	}
	
	public void print (int a) {
		System.out.println("두 키의 합은?" +a);
	}
	
}
