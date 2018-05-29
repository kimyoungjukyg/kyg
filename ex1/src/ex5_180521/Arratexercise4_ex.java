package ex5_180521;

public class Arratexercise4_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		String[] b={"사과","배","바나나","체리","딸기","포도"};
		int sum=0;
				for(int as : a) {
					sum+=as;
					System.out.print(as+" ");
				}System.out.println("의  합은"+sum);
				for(String bs : b ) {
					System.out.print(bs+" ");
				}
				

	}

}
