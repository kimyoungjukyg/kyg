package ex7_180524;

public class ch6_12_singletonex {

	public static void main(String[] args) {
		//일반적인 객체생성하는 방식
	//안됨	ch6_12_singleton obj2=new ch6_12_singleton();
		
		
		
		//싱글톤으로 선언한 클래스를 사용하는 방식
		ch6_12_singleton obj1=ch6_12_singleton.getInstance();
		

	}

}
