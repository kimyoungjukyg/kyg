package ex10_180529;
//protected로 선언된 필드,생성자,메소드는 자식클래스는 다른 패키지에 이썽도
//접근이 가능하지만 다른 패키지에 있는 일반클래스는 접근이 불가능함
public class ch7_07_A {
	//필드
	protected int speed;
	//생산자(기본생성자)
	protected ch7_07_A(){
		
	}
	//메소드
	protected void run() {
		speed+=1;
	}
	//A부모
	//B:같은패키지속 자식
	//C:다른패키지일반
	//D:다른패키지자식
	
	
}
