package ex8_180525;

import java.util.Scanner;

public class ch6_22_memberex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ch6_22_member memberservice=new ch6_22_member();
		Scanner sc=new Scanner(System.in);
		String id=null;
		int i;
		do{
		System.out.println("수행할 서비스를 선택하세요");
		System.out.println("1.로그인 || 2.로그아웃");
		System.out.print(">>");
		
		i=sc.nextInt();
		
		
		if(i==1) {
		
		System.out.print("아이디를 입력하세요: ");
		id=sc.next();
		
		System.out.print("비밀번호를 입력하세요: ");
		String pas=sc.next();
		
		boolean result=memberservice.login(id,pas);
		if(result) {
			System.out.println("로그인 되었습니다.");
		}else {
			System.out.println("id또는password가잘못됬습니다.");
		}}
		 if(i==2) {
			memberservice.logout(id);
		}
		}
		while(!(i==3));
		{System.out.println("수행서비스가없습니다. 재실행을요청합니다");}
		
		
	}

}
