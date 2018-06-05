package ex11_180503;
//추상클래스 선언
public abstract class ch7_12_phone {
	//필드선언
	public String owner;
	//생성자 선언
	public ch7_12_phone(String owner) {
		this.owner=owner;
		
	}
	//메소드 선언
	public void turnon() {
		System.out.println("폰전원을 켭니다");
	}
	public void turnoff() {
		System.out.println("폰전원을 끕니다");
	}
	
	
	
	
	
}
