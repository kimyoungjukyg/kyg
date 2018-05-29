package ex9_180528;

public class ch7_04_superso extends ch7_04_airplane{
	//1의값을 갖는 normal 상수 정의
	//2의 값을갖는 supersonic상수 정의
	public static final int NORMAL=1;
	public static final int SUPERSONIC=2;
	public int flyMode=NORMAL;
	//fly메소드 재정의
	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속비행입니다.");
		}else {
			//부모클래스의 메소드 호출(재정의가 안된)
			super.fly();
		}
	}
	
}
