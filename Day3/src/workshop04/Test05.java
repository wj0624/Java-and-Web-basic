package workshop04;

public class Test05 {

	public static void main(String[] args) {
		Account account;
		// account 객체 생성
		account = new Account("441-0290-1203", 500000, 7.3);
		// account 기본 정보 출력
		System.out.println("계좌정보: "+account.getAccount()+" 현재잔액: "+account.getBalance());
		// account 에 20000원 입금
		account.deposit(20000);
		// account 변경 정보 출력
		System.out.println("계좌정보: "+account.getAccount()+" 현재잔액: "+account.getBalance());
		// 이자 출력 – 현재 잔고를 기준으로 고객에게 줄 이자 금액을 출력 한다
		System.out.printf("이자: %.1f", account.calculateInterest());

	}

}
