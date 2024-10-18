package goodsmanage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Service_goods {
	Scanner sc = new Scanner(System.in);
	private ArrayList<Dto_goods> list;

	
	public Service_goods() {
		list = new ArrayList<Dto_goods>();
	}
		Dto_goods dtto = new Dto_goods();
	
	
	public void display() {
		while(true) {
		System.out.println("----CL 입출고 관리----");
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
		if(list.isEmpty()) {
			System.out.println("먼저 재고등록이 필요합니다.");
		}else {
			System.out.println((dtto.getItem() + dtto.getQuantity()));
		}
	}
	
	public void input() {
		System.out.println("2. 본사 입고 등록");
		System.out.print("품목(LugMi/CLSBox/Belt/Cabas): ");
		String item = sc.next();
		System.out.print("수량: ");
		int quantt = sc.nextInt();
		list.;
		dtto.setMainInventory(minvent);
			
	}
	
	public void outout() {
		System.out.println("3. 매장 출고 지정");
		System.out.print("출고 매장 (1)도산 (2)갤러리아");
		int shop = sc.nextInt();
		System.out.print("출고 품목(LugMi/CLSBox/Belt/Cabas): ");
		String item = sc.next();
		System.out.print("출고 수량: ");
		int quantt = sc.nextInt();
		
			
			int remains = minvent.get(item) - quantt;
			minvent.put(item, remains);
			dtto.setMainInventory(minvent);
			if(shop ==1) {
				int add = dinvent.get(item) + quantt;
				dinvent.put(item, add);
				dtto.setDsInventory(dinvent);	
			}else if (shop ==2) {
				int add = ginvent.get(item) + quantt;
				ginvent.put(item, add);
				dtto.setGalInventory(ginvent);	
			}
		
		
		
	}
	
	public void shopman() {
		System.out.println("4. 매장 재고 관리");
		System.out.println("1) 매장별 재고현황");
		System.out.println("2) 매장간 재고이동");
		
		int choice = sc.nextInt();
		switch(choice) {
		case 1: int a = shopcheck();
				shopprint(a);
			break;
		case 2: int b = shopcheck();
				moving(b);
			break;
		}
		
	}
	
	public int shopcheck() { //4-1 매장 재고현황- 매장선택
		System.out.print("매장 선택 (1)도산 (2)갤러리아");
		int shop = sc.nextInt();	
		return shop;
		
	}
	
	public void shopprint(int a) {// 4-1 매장재고현황 - 프린트
		if (a==1) {
			System.out.println(dtto.getDsInventory());
		}else if(a==2) {
			System.out.println(dtto.getGalInventory());
		}
	}
	public void moving(int a) {//4-2 매장간 재고이동
		if (a==1) {//도산
			System.out.print("이동 품목(LugMi/CLSBox/Belt/Cabas): ");
			String goods = sc.next().toUpperCase();
			System.out.println("이동 수량: " );
			int quant = sc.nextInt();
			
			int remains = dinvent.get(goods)-quant;
			dinvent.put(goods, remains);
			dtto.setDsInventory(dinvent);
			
		}else if( a==2) {//갤러리아
			System.out.print("이동 품목(LugMi/CLSBox/Belt/Cabas): ");
			String goods = sc.next().toUpperCase();
			System.out.println("이동 수량: " );
			int quant = sc.nextInt();
			
			int remains = ginvent.get(goods)-quant;
			ginvent.put(goods, remains);
			dtto.setGalInventory(ginvent);
		}
		
	}
}
