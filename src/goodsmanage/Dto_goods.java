package goodsmanage;

import java.util.HashMap;


public class Dto_goods { //상품관리 프로그램
	private String item;
	private int quantity;
	
	public Dto_goods() {}
	public Dto_goods(String item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}
	
	public String getItem() {
		return item;
	}
	
	public void setItem(String item) {
		this.item = item;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
