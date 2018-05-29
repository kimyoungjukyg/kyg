package ex8_180525;

public class ch6_24_balanceex {
	public static void main(String[] args) {
		ch6_24_balance account=new ch6_24_balance();
		account.setOne(10000);
		System.out.println("현재 잔고: "+account.getOne());
		account.setOne(-100);
		System.out.println("현재 잔고: "+account.getOne());
		account.setOne(2000000);
		System.out.println("현재 잔고: "+account.getOne());
		account.setOne(300000);
		System.out.println("현재 잔고: "+account.getOne());
	}

}
