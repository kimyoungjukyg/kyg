package ex7_180524;

public class ch6_18_ex {
	//필드값선언=값을부여
	String name;
	 int assignmentscore;
	int examscore;
	
	
	int A=(assignmentscore+examscore)/2;
	//생성자=값을담아주는행위
	//메소드 선언=값을활용
	void result() {
		
		System.out.println("이름: "+name);
		System.out.println("과제점수: "+assignmentscore);
		System.out.println("시험 점수: "+examscore);
		
		
		if(A>90) {
			System.out.println("학점은 :A");
		}else {
			System.out.println("학점은: B");
		}
	}
	
	
	
	
	
	
	
}
