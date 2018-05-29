package ex3_180517;

public class break1 {

	public static void main(String[] args) {
		//무한 반복문
		while(true) {
			int num=(int)(Math.random()*6)+1;
			System.out.println(num);
			//주사위가6이나왔을떄반복문종료
			if(num==6) {
				break;
				}
			
			}	System.out.println("반복문종료");
		}

	
	

}
