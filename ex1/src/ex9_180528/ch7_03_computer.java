package ex9_180528;
//calculator 클래스의 자식클래스
public class ch7_03_computer extends ch7_03_calculator{
	
	
	//부모클래스에서 선언한 areacircle메소들르 재정의함
	//굳이 @Override를쓰지않아도 아아서 메소드 재정의가 된것으로 인지하지만
	//컴파일러에게 정확한 지시를 위하여 사용(개발자의 편의를 위해서사용)
	@Override //@Override 로써도됨
	double areacircle(double r) {
		System.out.println("computer 객체의 areacircle()실행");
	return Math.PI*r*r;
	
	}
}
