package ex8_180525;

public class op {
	 
	String name;
	 int kscore;
	 int escore;
	 int mscore;
	
	
	
	void result() {
		int sum=kscore+escore+mscore;
		int avg=sum/3;
		
		System.out.println("이름: "+name);
		System.out.println("국어 성적: "+kscore);
		System.out.println("영어 성적:" +escore);
		System.out.println("수학 성적: "+mscore);
		System.out.println("평균: "+avg);
		
		
		
	}
	
	
	
	
	
	

}
