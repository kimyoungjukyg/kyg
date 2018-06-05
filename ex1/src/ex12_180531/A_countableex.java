package ex12_180531;

public class A_countableex {

	public static void main(String[] args) {
		A_countable[] m= {new A_bird("뻐꾸기"),new A_bird("독수리"),
				new A_tree("사과나무"),new A_tree("밤나무")};
		//다형성
		//m[0]= A_bird("뻐꾸기")
		//m[1]= A_bird("독수리")
		//m[2]= A_tree("사과나무")
		//m[3]= A_tree("밤나무")
	
		
	//포이치,향상된for문
		for(A_countable e:m) {
	/*
	 * 첫번쨰반복문
	 * e=m[0]
	 *  =A_bird("뻐꾸기")
	 * 뻐꾸기를 매개변수로 하는bird의 객체를 생성해서 e에 대입
	 */
			e.count();
		//System.out.println(m[]+"2마리 있다.");	
		}
	
		
		for(int i=0;i<m.length;i++) {
	//instanceof사용
			//조건물을 사용해서 배열에 저장된 각 요소가 bird클래스 타입인지 확인
			if(m[i] instanceof A_bird) {
				((A_bird)m[i]).fly();
			}else {
				((A_tree)m[i]).ripen();
			}
		
		
		
}
}}