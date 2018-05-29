package ex3_180517;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=93;
		/*if(score>=90) 
			System.out.println("if문 실행");*/
		//조건식 score가 90이상일경우 실행
		//중가로('{}')를안해주면 바로아래 조건만 실행
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A등급입니다.");
		}
		if(score<90) {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B등급입니다.");
		}
	
	}
	
	

}
