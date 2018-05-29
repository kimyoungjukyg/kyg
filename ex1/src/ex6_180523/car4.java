package ex6_180523;
//p.223
public class car4 {
//필드선언
	int gas;
	//메소드
	void setgas(int gas) {
		this.gas=gas;
	}
	
	boolean isleftgas() {
		if(gas==0) {
			System.out.println("gas가없습니다");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량:"+gas+")");
				gas-=1;
			}else {
				System.out.println("멈춥니다.(gas잔량:"+gas+")");
				return;//종료의 의미
			}
		}
		
	
	
	}
	
}
