package class_ex.third;

public class Account1 {
	//작성위치
	int balance;
	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE)
		this.balance = balance;
	}
	
}
