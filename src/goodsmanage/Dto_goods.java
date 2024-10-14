package goodsmanage;

import java.util.HashMap;


public class Dto_goods { //상품관리 프로그램
	private HashMap<String, Integer> mainInventory = new HashMap<String, Integer>();
	
	public HashMap<String, Integer> getMainInventory() {
		return mainInventory;
	}

	public void setMainInventory(HashMap<String, Integer> mainInventory) {
		this.mainInventory = mainInventory;
	}

	public HashMap<String, Integer> getDsInventory() {
		return dsInventory;
	}

	public void setDsInventory(HashMap<String, Integer> dsInventory) {
		this.dsInventory = dsInventory;
	}

	public HashMap<String, Integer> getGalInventory() {
		return galInventory;
	}

	public void setGalInventory(HashMap<String, Integer> galInventory) {
		this.galInventory = galInventory;
	}

	private HashMap<String, Integer> dsInventory = new HashMap<String, Integer>();
	
	private HashMap<String, Integer> galInventory = new HashMap<String, Integer>();
}
