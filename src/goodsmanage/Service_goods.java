package goodsmanage;

import java.util.Scanner;

public class Service_goods {
	Scanner sc = new Scanner(System.in);
	public void display() {
		while(true) {
		System.out.println("----CELINE 입출고 관리----");
		System.out.println("1. 본사 현황");
		System.out.println("2. 입고 등록");
		System.out.println("3. 매장 출고");
		System.out.println("4. 매장 관리");
		System.out.print(">>>>>>");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			mainInvent();
			break;
		case 2:
			input();
			break;
			
		case 3:
			outout();
			break;
			
		case 4:
			shopman();
			break;
		}
		
		
		}
	}
	
	public void mainInvent() {
		System.out.println("1. 본사재고 현황");
	}
	
	public void input() {
		System.out.println("2. 본사 입고 등록");
	}
	
	public void outout() {
		System.out.println("3. 매장 출고 지정");
	}
	
	public void shopman() {
		System.out.println("4. 매장 재고 관리");
		System.out.println("1) 매장별 재고현황");
		System.out.println("2) 매장별 재고이동");
	}
}
