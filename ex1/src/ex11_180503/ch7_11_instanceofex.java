package ex11_180503;

public class ch7_11_instanceofex {
	
	
	//method1의 매개변수:parent클래스 타입의 변수 parent
	public static void method1(ch7_11_parent parent) {
	//parent 변수가ch7_11_child 클래스 타입인지?
		if(parent instanceof ch7_11_child) {
			//parent 변수child 클래스타입으로 강제형변환해서
			//child클래스 타입의 변수 child에 대입한다.
		ch7_11_child child=(ch7_11_child) parent;
		System.out.println("method1-child로변환성공");
	}else {System.out.println("method1-child로변환실패");}}

	public static void method2(ch7_11_parent parent){
		ch7_11_child child=(ch7_11_child) parent;
		System.out.println("method1-child로변환성공");
	}
	
	
	public static void main(String[] args) {
		/*
		 * 객체 타입을 확인하고 instanceof연산자
		 * 강제타입변환이 가능한지 여부를 판단하기 위해 사용하는 연산자
		 */
		//parent 타입의 변수 선언해서 child객체를 대입
		//method1,2를 각각호출
		ch7_11_parent ch=new ch7_11_child();
		method1(ch);
		method2(ch);
		//parent 타입의 변수를 선언해서 parent 객체를 대입
		//method1,2를 각각 호출
		ch7_11_parent pa=new ch7_11_parent();
		method1(pa);
		method2(pa);

	}

}
