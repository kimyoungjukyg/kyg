package ex7_180524;

public class ch6_12_singleton {
	//자기자신객체화
	private static ch6_12_singleton singleton =new ch6_12_singleton();
	
	private ch6_12_singleton() {
		
	}
	static ch6_12_singleton getInstance(){
		return singleton;
	}

}
