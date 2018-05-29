package ex10_180529;
//자동타입변환예제
//A클래스 선언
class A{};
//A클래스의 자식클래스인B서넌
class B extends A{}
//A클래스의 자식클래스만 C클래스선언
class C extends A{}
//B클래스의 자식클래스인 D
class D extends B{}
//C클래스의 자식클래스인 E
class E extends C{}
public class ch7_08_pomotionex {
public static void main(String[] args)
{
//B클래스 타입의 변수 b선언
	B b=new B();
	//C클래스 타입의 변수 c선언
	C c=new C();
	//D클래스 타입의 변수 d선언
	D d=new D();
	//E클래스 타입의 변수 e선언
	E e=new E();
	
	//각각 선언한 변수들에 대한 자동형변환 여부확인
	//A클래스 타입의 변수에 B클래스 타입변수대입
	A a1=b;
	//A클래스 타입의 변수에 C클래스 타입변수대입
	A a2=c;
	//A클래스 타입의 변수에 D클래스 타입변수대입
	A a3=d;
	//A클래스 타입의 변수에 E클래스 타입변수대입
	A a4=e;
	
	B b1=d;
	C c1=e;
	//B클래스와 E클래스는 서로연결 x
	//B b2=e;
	//C클래스와 D클래스는 서로연결 x
	//C c2=d;
	
	//a1이 A클라스여서 B보다더크기떄문에
	//B b3=a1;
	//강제형변환시사용은가능
	B b4=(B)a1;
	
	
	
	
	
	
}}
