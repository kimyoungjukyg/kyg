package ex10_180529;



public class ch7_08_carex {
	public static void main(String[] args) {
		//car클래스에 대한 객체선언
		//car클래스 타입변수 car선언
		ch7_08_car car=new ch7_08_car();
		//부모클래스타입의변수선언
		ch7_08_tire tire=new ch7_08_tire("aaa",10);
		//자식클래스타입의 변수선언
		ch7_08_hankooktire hktire =new ch7_08_hankooktire("한국",10);
		
		tire=hktire;//자식클래스타입변수를 부모클래스타입변수에대입
		hktire=(ch7_08_hankooktire) tire;//부모클래스타입변수를 자식클래스타입변수에대입(큰>작):자동변한x>오류
		
		
		
		
		for(int i=1;i<=5;i++) {//5번반복
			int problemlocation=car.run();
			switch(problemlocation) {
			case 1://return 1번
				System.out.println("앞왼쪽 hankooktire로 교체");
				car.frontlefttire=new ch7_08_hankooktire("앞왼쪽",15);
				break;
			case 2://return 2번
				System.out.println("앞오른쪽 kumhotire로 교체");
				car.frontrighttire=new ch7_08_kumhotire("앞오른쪽",13);
				break;
			case 3://return 3번
				System.out.println("뒤왼쪽 hankooktire로 교체");
				car.backlefttire=new ch7_08_hankooktire("뒤왼쪽",14);
				break;
			case 4://return 4번
				System.out.println("뒤오른쪽 kumhotire로 교체");
				car.backrighttire=new ch7_08_kumhotire("뒤오른쪽",17);
				break;
			}
			System.out.println("------------------------");
		}
	}
	
	
	
}
