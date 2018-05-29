package ex8_180525;

public class ch6_24_balance {
	
	
	private int one;
	static final int  min_one=0;//final int :상수값변수
	static final int max_one=1000000;
	public int getOne() {
		
		return one;
	}
	public void setOne(int one) {
		if(one>=min_one && one<=max_one)
		this.one = one;
	}

	
	
	
}
