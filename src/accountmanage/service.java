package accountmanage;

import java.util.HashMap;
import java.util.Scanner;

class enter extends service {
	public void enterance() {
		System.out.println("---우리은행---");
		System.out.print("계좌번호를 입력: ");
		int accnum = sc.nextInt();
		System.out.print("비밀번호 입력: ");
		int pw = sc.nextInt();

		if (accountMap.isEmpty()) {
			System.out.println("해당 계좌가 없습니다. 계좌 개설 진행합니다.");
			super.open();
			this.enterance();
		}

		else {
			System.out.println("인증되었습니다. 시스템 입장");
			super.display();
		}
	}

}

public class service {
	Scanner sc = new Scanner(System.in);
	dto dt = new dto();
	HashMap<Integer, Integer> accountMap = dt.getAccount();
	int num, bal, money;

	public void display() {

		boolean run = true;
		int choice;
		while (run) {
			System.out.println("---우리은행---");
			System.out.println("1. 계좌 개설");
			System.out.println("2. 잔액 확인");
			System.out.println("3. 입금");
			System.out.println("4. 출금");
			System.out.println("5. 송금");
			System.out.println("6. 종료");
			System.out.print(">>>>>>>>>>");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				open();
				break;
			case 2:
				blcheck();
				break;
			case 3:
				putmoney();
				break;
			case 4:
				takemoney();
				break;
			case 5:
				withdraw();
				break;

			case 6:
				System.out.println("이용해주셔서 감사합니다.");
				return;
			}
		}

	}

	public void open() {// 계좌 개설
		System.out.println("---계좌개설---");
		Integer bankacc = (int) (Math.random() * 9000) + 1000;
		System.out.println("개설된 계좌번호는 " + bankacc + "입니다.");
		accountMap.put(bankacc, 0);
		dt.setAccount(accountMap);

	}

	public void blcheck() {// 잔액확인
		System.out.println("---잔액확인---");

		if (accountMap.isEmpty()) {
			System.out.println("먼저 계좌를 개설하세요");
		} else {
			System.out.print("계좌번호 입력: ");
			num = sc.nextInt();
			int bal = accountMap.get(num);
			System.out.println("계좌의 잔액은 " + bal + "원 입니다");
		}
	}

	public void putmoney() {// 입금메뉴
		if (accountMap.isEmpty()) {
			System.out.println("먼저 계좌를 개설하세요");
		} else {
			System.out.println("---계좌입금---");
			System.out.print("계좌번호 입력: ");
			num = sc.nextInt();
			System.out.print("금액 입력: ");
			money = sc.nextInt();

			thread();

			int bal = accountMap.get(num) + money;
			accountMap.put(num, bal);
			dt.setAccount(accountMap);
			System.out.println("입금이 완료되었습니다");

		}
	}

	public void takemoney() {// 출금메뉴
		if (accountMap.isEmpty()) {
			System.out.println("먼저 계좌를 개설하세요");
		} else {
			System.out.println("---계좌출금---");
			System.out.print("계좌번호 입력: ");
			num = sc.nextInt();
			System.out.print("출금하실 금액: ");
			money = sc.nextInt();
			System.out.print(">");
			thread();

			int bal = accountMap.get(num) - money;
			accountMap.put(num, bal);
			dt.setAccount(accountMap);
			System.out.println(num + "계좌에서 " + money + "원이 출금되었습니다.");
			System.out.println("현재 잔액은 " + bal + "원입니다.");
		}
	}

	public void withdraw() {// 송금메뉴
		if (accountMap.isEmpty()) {
			System.out.println("먼저 계좌를 개설하세요");
		} else {
			System.out.println("---송금하기---");
			System.out.print("본인의 계좌번호 입력: ");
			num = sc.nextInt();
			System.out.print("송금하실 금액: ");
			money = sc.nextInt();

			System.out.print("송금하실 계좌번호 입력: ");
			int acc = sc.nextInt();
			if (!accountMap.containsKey(acc)) {
				System.out.println("올바르지 않은 계좌번호입니다");
			} else {
				thread();
				bal = accountMap.get(num) - money;
				accountMap.put(num, bal);
				accountMap.put(acc, accountMap.get(acc) + money);
				dt.setAccount(accountMap);
				System.out.println(acc + " 계좌로 " + money + "원이 송금되었습니다.");
				System.out.println("현재 " + num + " 계좌의 잔액은" + bal + "원입니다.");
			}
		}

	}

	public void thread() { // 지연 메소드
		System.out.print(">");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(">");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(">");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(">");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
