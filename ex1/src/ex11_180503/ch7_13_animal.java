package ex11_180503;

public abstract class ch7_13_animal {
	public String kind;
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상메소드선언
	//추상메소드는 실행블록이 없고 단지 메소드 이름,리턴타입 등만 선언
	public abstract void sound();
	
	
	
	
	
	
}
