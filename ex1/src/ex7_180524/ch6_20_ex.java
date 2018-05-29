package ex7_180524;

public class ch6_20_ex {
	private String setownername;//이름
	private int setaccountnumber;//계좌
	private int setbalance;//초기금액
	private int deposit;//입금
	private int withdraw;//출금
	
	public String getSetownername() {
		return setownername;
	}
	public void setSetownername(String setownername) {
		this.setownername = setownername;
	}
	public int getSetaccountnumber() {
		return setaccountnumber;
	}
	public void setSetaccountnumber(int setaccountnumber) {
		this.setaccountnumber = setaccountnumber;
	}
	public int getSetbalance() {
		return setbalance;
	}
	public void setSetbalance(int setbalance) {
		this.setbalance = setbalance;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	
	void result() {
		System.out.println("예금주 이름: "+setownername);
		System.out.println("계좌번호: "+setaccountnumber);
		System.out.println("잔고: "+money1());
	}
	public int money1() {
		
		int sum=(this.setbalance+this.deposit-this.withdraw);
		
		if((this.setbalance+this.deposit)<this.withdraw) {
			System.out.println("잔액이부족합니다.");
			}
	
		return sum;
	}
	
	

}
