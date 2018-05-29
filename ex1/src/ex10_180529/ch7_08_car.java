package ex10_180529;

public class ch7_08_car {
	//필드
	ch7_08_tire frontlefttire=new ch7_08_tire("앞왼쪽",6); //앞왼쪽 수명6
	ch7_08_tire frontrighttire=new ch7_08_tire("앞오른쪽",2);//앞오른쪽 수명2
	ch7_08_tire backlefttire=new ch7_08_tire("뒤왼쪽",3);//뒤왼쪽 수명3
	ch7_08_tire backrighttire=new ch7_08_tire("뒤오른쪽",4);//뒤오른쪽 수명4
	
	
	//tire 클래스타입의 배역변수를 선언해서 우변에 있는내용을 각각 배열변수에 대입
	ch7_08_tire[] tire=new ch7_08_tire[100];
	ch7_08_tire[] tire1= {};
	ch7_08_tire[] tire2= {
			new ch7_08_tire("앞왼쪽",6),
			new ch7_08_tire("앞오른쪽",2),
			new ch7_08_tire("뒤왼쪽",3),
			new ch7_08_tire("뒤오른쪽",4)
	};
	/*tire2[0]=new tire("앞왼쪽",6),
			tire2[1]=new tire("앞오른쪽",2),
					tire2[2]=new tire("뒤왼쪽",3),
							tire2[3]new tire("뒤오른쪽",4)*/
		
	
	//생성자
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontlefttire.roll()==false) {stop();return 1;}//펑크시 1번 리턴
		if(frontrighttire.roll()==false) {stop();return 2;}//펑크시 2번 리턴
		if(backlefttire.roll()==false) {stop();return 3;}//펑크시 3번 리턴
		if(backrighttire.roll()==false) {stop();return 4;}//펑크시 4번 리턴
		return 0;
	}
	void stop() {
		System.out.println("[자동차가 멈춤니다]");
	}
	
	
	
	
}
