package ex7_180524;

public class ch6_10_car {
	String model;
	/*public ch6_10_car(String model){
	this.model=model;
	}
	*/
	//생성자의 이름은 class와동일하게 선언
	ch6_10_car(String model) {
		this.model=model;
	}
	
	int speed;
	
	void run() {
		while(true) {
			if(speed<50) {
				speed+=10;
				System.out.println(model+"가 달립니다.(시속:"+speed+"km/h)");
			
			}
				
				
			else {
				return;//종료의 의미
			}
		}
}
}