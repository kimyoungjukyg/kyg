package ex7_180524;
//생성자 접근제한 예제
public class ch6_15_A {
	//필드선언
	//a1,a2,a3 필드는 A클래스 타입으로 선언
	ch6_15_A al=new ch6_15_A(true);
	ch6_15_A a2=new ch6_15_A(1);
	ch6_15_A a3=new ch6_15_A("문자열");
	
	
	//생성자 선언
	//public
	public ch6_15_A(boolean b) {}
	//default
	ch6_15_A(int b){}
	//private
	private ch6_15_A(String s) {}
}
