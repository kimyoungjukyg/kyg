package ex11_180503;

public class ch7_12_phoneex {
public static void main(String[] args) {
	//자식클래스의 객채생성
	ch7_12_smartphone smart=new ch7_12_smartphone("소유자");
	//추상클래스의 객체생성>객체화불가
	//ch7_12_phone phone=new ch7_12_phone("소유자");
	
	
	smart.turnon();//상속받았기떄문에 부모클래스메소드호출가능
	smart.turnoff();
	smart.internetserch();
	
	
	
	
	
	
	
	
}
}
