package ex8_180525;

import java.util.Scanner;

public class ch6_25_accountex {
	//account 클래스 타입의 accountArrat배열을 선언
	private static ch6_25_account[] accountArrat=new ch6_25_account[100];
	private static Scanner scanner =new Scanner(System.in);
	
	
	
	
	public static void main(String[] args) {
		
		boolean run=true;
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.println("선택> ");
			int selectno=scanner.nextInt();
			
			if(selectno==1) {
				createaccount();
				
			}else if(selectno==2) {
				accountlist();
			}else if(selectno==3) {
				deposit();
			}else if(selectno==4) {
				withdraw();
			}else if(selectno==5) {
				run=false;
			}
		
		}
		System.out.println("프로그램종료");
		
	}
	//main과별개
	//계좌생성을 위한 createaccount메소드
	
	static int i=0;
	private static void createaccount() {
		
		
		System.out.println("------------");
		System.out.println("계좌생성");
		System.out.println("------------");
		System.out.println("계좌 번호:");
		String ano=scanner.next();
		//accountArrat.setAno(scanner.next())
		System.out.println("계좌주: ");
		String owner=scanner.next();
		
		System.out.println("초기 입금금액: ");
		int balance=scanner.nextInt();
		ch6_25_account ca=new ch6_25_account(ano,owner,balance);
		
		accountArrat[i]=ca;
		i++;
		System.out.println("계좌가 생성되었습니다.");
	}
	static int k=0;
	private static void accountlist() {
		k=0;
		System.out.println("------------");
		System.out.println("계좌목록");
		System.out.println("------------");
			while(k<i) {
			System.out.println(accountArrat[k].getAno()+"\t"+accountArrat[k].getOwner()+"\t"+accountArrat[k].getBalance());
			k++;}
	}
	//예금처리 메소드
	static int a=0;
	private static void deposit() {
		a=0;
		System.out.println("------------");
		System.out.println("예금");
		System.out.println("------------");
		System.out.println("계좌 번호:");
		String ano=scanner.next();
		while(i>a) {
			if(accountArrat[a].getAno().equals(ano)) {
				System.out.println("예금액");
				int add=scanner.nextInt();
				//Account 클래스 타입의 account 변수선언
				//우변내용:findAccount 
	   add=accountArrat[a].getBalance()+add;
	   accountArrat[a].setBalance(add);
	   a++;
	   return;}
		if(!(accountArrat[a].getAno().equals(ano))){
		   System.out.println("계좌가 없습니다.");
	   return;
	   }
		}
	}
//매개변수ano
	//리턴타입 Account 클래스
	static int c=0;
	private static void withdraw()
	{c=0;
		System.out.println("------------");
		System.out.println("출금");
		System.out.println("------------");
		System.out.println("계좌 번호:");
		String ano=scanner.next();
		
		while(i>c) {
			if(accountArrat[c].getAno().equals(ano)) {
				
				System.out.println("예금액");
				int qu=scanner.nextInt();
	   qu=accountArrat[c].getBalance()-qu;
	   if(qu<0) {
		   System.out.println("금액이 부족합니다.");
		   return;
	   }
	   accountArrat[c].setBalance(qu);
	   c++;
	   return;}
			if(!(accountArrat[c].getAno().equals(ano))){
		   System.out.println("계좌가 없습니다.");
		   return;
	   }
		}
	}	
	
	}
//생성자는리턴값 x 
//메소드는 리턴값필수 리턴값없을시void로선언


/*타입은 클라스(동일한 것찾을떄사용)
 * 매개변수 ano
 * 리턴타입 Account 클래스
 * private static ch6_25_account findAccount(String ano){
 * 다른곳에서 써먹을떄는 findAccount(ano);
 * ch6_25_account account =null;
for(int i=0;i<accountArrat.,length;i++){
if(acountArrat[i]!=null)
{Srting dbAno=accountArray[i].getAno();
if(dbAno.equlas(ano)){
account=accountArray[i];
break;}}}
 * 

*/