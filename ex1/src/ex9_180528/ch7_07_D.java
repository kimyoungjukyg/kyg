package ex9_180528;
import ex10_180529.ch7_07_A;
public class ch7_07_D extends ch7_07_A{
	public ch7_07_D() {
		//부모클래스의 생성자 호출
		super();
		//부모클래스(A클래스)의 필드,메소드에 접근가능한지확인
		this.speed=1;
		this.run();
	}
}
