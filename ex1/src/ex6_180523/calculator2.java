package ex6_180523;

public class calculator2 {
	
	int plus(int x,int y) {//3번쨰
	int result=x+y;
	return result;
	
}
	double avg(int x,int y) {//2번쨰
		double sum=plus(x,y);
		double result=sum/2;
		return result;
	}
	
	void execute() {//가장먼저 호출
		double result=avg(7,10);
		println("실험결과:"+result);
	}
	
	void println(String message) {//마지막
		System.out.println(message);
		//==System.out.println("실험결과:"+result);
	}
	
}
