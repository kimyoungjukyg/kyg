package ex10_180529;

public class ch7_06_car {
//필드 ,메소드,final 메소드
	//필드선언
	public int speed;
	
	//메소드선언
	public void speedup() {
		speed+=1;
	}
	
	//final 메소드
	public final void stop() {
		System.out.println("멈춤니다.");
		speed=0;
	}
}
