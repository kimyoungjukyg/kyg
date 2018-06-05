package ex12_180531;

public class ch11_02_SrtingEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("이름");
		String str2="이름";
		if(str1==str2) {
			System.out.println("같은String 객체를 참조");
		}else {
			System.out.println("다른string객체를 참조");
		}
		if(str1.equals(str2)) {
			System.out.println("같은 문자열을 가짐");
		}else {
			System.out.println("다른 문자열을 가짐");
		}
		
		
	}

}
