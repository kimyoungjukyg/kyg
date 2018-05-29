package ex3_180517;

public class Ifdice {

	public static void main(String[] args) {
		/*random메소드 
		 * Math.random():double타입의 실수 출력(0.0<= <1.0)
		 * 0-9까지의 난수를 발생시키려면
		 * (int)(Math.random()*10)	
		 * 1-10까지 난수 발생
		 * (int)(Math.random()*10)+1
		 * 로또번호
		 * (int)(Math.random()*45)+1	
		 * ex)주사위 번호뽑기
		 * 1-6까지난수를 발생해서 1이나오면 1번이 나왔습니다.
		 */
		int A= (int)(Math.random()*6);
		
		if(A==1) {
			System.out.println("1번이 나왔습니다");
		}else if(A==2) {System.out.println("2번이 나왔습니다");}
		else if(A==3) {System.out.println("3번이 나왔습니다");}		
		else if(A==4) {System.out.println("4번이 나왔습니다");}
		else if(A==5) {System.out.println("5번이 나왔습니다");}
		else{System.out.println("6번이 나왔습니다");}
		

	}

}
