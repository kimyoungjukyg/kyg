package ex6_180523;

public class car4ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//car 클래서 객체 생성
		car4 car=new car4();
		//setGas메소드 호출,매개값5
		car.setgas(5);
		//isLeftgas메소드 호출결과를 gasState라는 변수에 담으세요.
		boolean gasstate=car.isleftgas();
		if(gasstate) {
			System.out.println("출발합니다.");
			car.run();
			
		}
		//여기까지실행됐을떄 gas필드값은?=>0=>isLeftgas값은false
		if(car.isleftgas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
				
			
		}else {
			System.out.println("gas를 주입하세요.");
		}
		
		

	}

}
