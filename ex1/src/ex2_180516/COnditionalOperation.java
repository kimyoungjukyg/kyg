package ex2_180516;

public class COnditionalOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=85;
		char grade=(score>90)?'A':'B';
		//char grade=(score>90)?'A':((score>80)?'B':'C'); /3조건
		//길어질시 if else가더나음
		System.out.println("당신의 성적은"+grade+"입니다.");
		
		

	}

}
