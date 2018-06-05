package ex12_180531;

public class ch10_02_arrayindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[3];
		try {
		for(int i=0;i<=num.length;i++) {
			num[i]=1;
			System.out.println(num[i]);}}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("아웃");
		}finally {
			System.out.println("finally는 무조건실행됨");
		}
		
		
		
	}

}
