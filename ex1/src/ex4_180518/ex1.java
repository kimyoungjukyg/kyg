package ex4_180518;



public class ex1 {

	public static void main(String[] args) {
		int a=0;
		int sum=0;
		
		 for(int b=1; sum<100; b++) {
				if(b%2==1) {
				sum+=b;
			}else if(b%2==0) {
				sum-=b;
			}
			a=b;
				
			}
			
		 System.out.println(a);	
		}
	}

/*
 * for(a=1;sum<100;a++,b=-b){
 * c=a*b;
 * sum=sum+c;
  */


