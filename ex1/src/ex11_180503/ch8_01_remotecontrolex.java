package ex11_180503;

public class ch8_01_remotecontrolex {
public static void main(String[] args) {
	//인터페이스 타입의 변수선언
	ch8_01_remotecontrol rc;
	//각각의 객체를 인터페이스 타입 변수에 대입
	//ch8_01_television타입의 변수로사용
	rc=new ch8_01_television();
	rc.turnon();
	rc.turnoff();
	rc.setmute(true);
	
	//ch8_01_odio타입의 변수로 사용
	rc=new ch8_01_odio();
	rc.turnon();
	rc.turnoff();
	rc.setmute(true);
	//rc.changevattery();
	//changevattery는 static문이기때문에 직접지정
	ch8_01_remotecontrol.changevattery();
}
}
