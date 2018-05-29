package ex6_180523;
//method overloading p.232
public class calculator3 {
	//정사각형의 넓이를 구하는 메소드
	//메소드이름:areaRectangle
	
	int a2(int x) {
		int result=x*x;
		return result;
	}
	
	void arearectangle() {
		int result=a2(10);
		println1("정사각형의 넓이: "+result);
	}
	void println1(String string){
		System.out.println(string);
		
	}
	
	//직사각형의 넓이를 구하는 메소드
	int a1(int x,int y) {
		int result=x*y;
		return result;
	}

	void rectangle() {
		int result=a1(10,4);
		println1("직사각형의 넓이: "+result);
	}
	
	void println1(int message){
		System.out.println(message);}}
//main 클래스의 실행내용
/*
 * 객체생성해서
 * 정사각형 넒이 구하는 메소드 호출하고 결과 출력
 * 직사각형 넓이 구하는 메소드 호출하고 결과 출력
 */
