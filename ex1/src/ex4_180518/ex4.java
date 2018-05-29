package ex4_180518;

public class ex4 {
	public static void main(String[] args) {
		
		System.out.println("2x+4y=10의 해를구하시오");
		for(int y=0; y<=10 ; y++) {
			for(int x=0; y+2*x<=10; x++) {
			if(4*y+2*x==10) {
				System.out.print("x값:"+x+" ");
			System.out.println("y값:"+y);
			}
			}
		}

	}

}
