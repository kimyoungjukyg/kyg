package ex12_180531;

public class ch8_02_car {
	//좌변:tire인터페이스 타입의 변수 frontlefttiret선언
	//우변:한국타이어 객체를 만듬
	ch8_02_tire frontlefttire=new ch8_02_hank();
	ch8_02_tire frontrighttire=new ch8_02_hank();
	ch8_02_tire backlefttire=new ch8_02_hank();
	ch8_02_tire backrighttire=new ch8_02_hank();

	void run() {
		frontlefttire.roll();
		frontrighttire.roll();
		backlefttire.roll();
		backrighttire.roll();
	}
	
}
