package ex8_180525;

public class ch6_23_abs {
	int x;
	int y;
	int x2;
	int y2;
	int m;
	void km(){
		double km=Math.sqrt(((x-x2)*(x-x2))+((y-y2)*(y-y2)));//Math.sqrt():루트
		System.out.println("두사이의 거리는 "+km);
	}
	void las(int m) {
		if(m>=0) {
			m=+m;
			System.out.println("입력한 정수의 절대값은"+m+"입니다.");
		}else {
			m=-m;
			System.out.println("입력한 정수의 절대값은"+m+"입니다.");
		}
	}
	void op() {System.out.println("수행할 내용을 선택하시요.");
	System.out.println("1. 두점 사이의 거리 구하기");
	System.out.println("2. 절대값 구하기");
	System.out.print("선택>> ");}

}
