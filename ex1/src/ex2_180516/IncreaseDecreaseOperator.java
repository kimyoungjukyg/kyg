package ex2_180516;

public class IncreaseDecreaseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=10;
		int z;
		System.out.println("-------------------");
		x++;//x=10
		//x=11
		++x;//x=12
		//x=12
		System.out.println("x="+x);
		System.out.println("-------------------");
		y--;//y=10
		//x=12,y=9
		--y;//y=8
		//x=12,y=8
		System.out.println("y="+y);
		System.out.println("-------------------");
		z=x++;
		//x=13,y=8,z=12
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("-------------------");
		z=++x;
		//x=14,y=8,z=14
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("-------------------");
		z=++x + y++;  
		//x=15,y=9,z=23
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("y="+y);

	}

}
