package ex7_180524;

public class ch6_16_B {

	public ch6_16_B() {
		ch6_16_A a=new ch6_16_A();
		a.field1=1;
		a.field2=1;
		//field3는 private라서 같은 패키지여도 보이지않음
		//a.field3=1;
		a.method1();
		a.method2();
		//field3와동일
		//a.method3();
		

	}

}
