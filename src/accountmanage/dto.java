package accountmanage;

import java.util.HashMap;

public class dto {
	
	private HashMap<Integer, Integer> account;

	public dto() { //생성자에서 초기화
		this.account = new HashMap();
	}
	
	public HashMap<Integer, Integer> getAccount() {
		return account;
	}

	public void setAccount(HashMap<Integer, Integer> account) {
		this.account = account;
	}

	

}
