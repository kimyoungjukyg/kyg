package ex7_180524;
//getter,setter 메소드 사용하는 클래스
public class ch6_17_carex {

	public static void main(String[] args) {
		ch6_17_car car=new ch6_17_car();
		
		//setter를 호출하여 속도값을 설정
		//car.setspeed=100;=>private라서 x
		car.setSpeed(100);
		System.out.println("현재속도:"+car.getSpeed());
		
		if(!car.isStop()) {
			car.setStop(true);
		}
		System.out.println("현재속도:"+car.getSpeed());
		
	}

}
