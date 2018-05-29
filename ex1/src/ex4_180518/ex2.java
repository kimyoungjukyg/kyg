package ex4_180518;

public class ex2 {
	public static void main(String[] args) {
		int a=1;
		int b=1;
		int c=1;
		int sum=0;
		while(true) {
			sum=sum+c;
			if(sum>=100)
				break;
			a++;//순차적숫자증가
			b=-b;//부호변경
			c=a*b;
		}
		
			
		 System.out.println(a);	
		}}
	

