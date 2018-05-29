package ex6_180523;

public class koreanex {

	public static void main(String[] args) {
		
		//본인의 이름과 주민번호 앞자리로 k1,k2객체를 각각 생성해서 필드값을출력
		korean k1=new korean("김용주","961007");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		korean k2=new korean("리오","981001");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		
		//k2와k1은 별계
		
		

	}

}
