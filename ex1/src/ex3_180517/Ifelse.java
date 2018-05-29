package ex3_180517;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * score 변수값을 85로선언
		 * score가 90이상이면 90보다 큽니다.등급은 A입니다
		 * 90미만인 경우 90보다 작습니다. 등급은 B입니다.
		 * */
		int score=85;
		if(score>=90) {
			System.out.println("등급은 A입니다");}
			else if(score<90)
				{
				System.out.println("등급은 B입니다.");
			
		//else{System.out.println("등급은 B입니다.");}:가능
		
				}
		

	}

}
