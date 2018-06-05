package ex12_180531;

public class ch11_03_stringindexof {
	public static void main(String[] args) {
		//indexof()메소드
		//검색기능
		String subject="자바프로그래밍";
		int location=subject.indexOf("프로그래밍");
		System.out.println("location의 값: "+location);
		
		//length() 메소드
		int length =subject.length();
		System.out.println("length의 길이"+length);
		
		//replace()메소드
		//글자변환
		String newStr=subject.replace("자바","java");
		System.out.println(newStr);
		
		//substring()메소드
		String ssn="180531-3456789";
		//0부터6까지
		String firstNum=ssn.substring(0,6);
		//7번인댁스부터(0부터시작)
		String secondNum=ssn.substring(7);
		System.out.println("firstNum:"+firstNum);
		System.out.println("secondNum:"+secondNum);
		
		//toLowerCase(),toUpperCase()메소드
		String str3="avgyVKVVuysgyvbAUHVBSVl";
		//모두소문자
		String str3Lower=str3.toLowerCase();
		//모두대문자
		String str3Upper=str3.toUpperCase();
		System.out.println("str3Lower: "+str3Lower);
		System.out.println("str3Upper: "+str3Upper);
		
		
		//trim()메소드
		//앞뒤공백제거
		String tel1="     02";
		String tel2="1234     ";
		String tel3="    55555    ";
		
	String tel=tel1.trim()+tel2.trim()+tel3.trim();
	System.out.println(tel);
		
		
		
		
		
		
		
		
		
		if(subject.indexOf("자바")!=-1) {
			System.out.println("자바와 관련된 책");
		}else {
			System.out.println("자바와 관련없는 책");
		}
	}
}
