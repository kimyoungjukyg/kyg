package ex11_180503;

public class ch7_13_cat extends ch7_13_animal{
	public ch7_13_cat() {
		this.kind="포유류";
	}
	//부모클래스에서 정의된 추상메소드를 구체화
	@Override
	public void sound() {
		System.out.println("야옹");
		
	}}
