package Fishing;

import java.util.*;

public class login{
	
String necname;
int num;
String name;
String password;
String logID;
String logPassword;
int k;
int i;
int a;
Scanner sc=new Scanner(System.in);
fishcase fishcase=new fishcase();
shop shop=new shop();
logon lo[]=new logon[100];
void enterShop() {}



void newID() {

	System.out.println("       회원가입");
	System.out.println("=====================");
	System.out.println("사용할 ID를 입력해주세요. ");
	System.out.print(">>");
	String logID=sc.next();
	System.out.println("사용할 Password를 입력해주세요. ");
	System.out.print(">>");
	String logPassword=sc.next();
	System.out.println("사용할 닉네임을 입력해주세요 ");
	System.out.print(">>");
	String necname=sc.next();
	System.out.println("계정이 생성되었습니다.");
	logon loge=new logon(logID,logPassword,necname);
	
	lo[i]=loge;

	i++;
	main();
	
	
}
int m=0;
int t=0;

void logi() {
	a=0;

	System.out.println("        로그인");
	System.out.println("=====================");
	System.out.println("ID를 입력해주세요 ");
	System.out.print(">>");
	name=sc.next();
	System.out.println("PASSWORD를 입력해주세요 ");
	System.out.print(">>");
	password=sc.next();
	
	if(i==0) {
		System.out.println("회원이 아닙니다.");
		System.out.println();
		main();
	}
	
	
	while(a<i) {	
	k=a;
	if(name.equals(lo[a].logID)&& password.equals(lo[a].logPassword)) {
	System.out.println(lo[a].necname+"님이 로그인되었습니다.");	
	m=4;
	gamem();
	}
	a++;
	}
	
	if(name.equals(lo[t++].logID)){
	t=t;
	}
	
	
	while(m==0) {	
	 if(name.equals(lo[t].logID) && !password.equals(lo[t].logPassword)) {
		System.out.println("Password가 틀렸습니다.");
		logi();
	}
	else if(!name.equals(lo[t].logID) && !password.equals(lo[t].logPassword))
	{
	System.out.println("회원이 아닙니다.");
	System.out.println("메인화면으로 돌아갑니다.");
	main();
	System.out.println();
	}	
	}
	}
	
	
	

void main() {
	System.out.println("      Fishing");
	System.out.println("=====================");
	System.out.println("    메뉴를 선택해 주세요.");
	System.out.println("1.로그인                 2.회원가입");
	System.out.print(">>");
	num=sc.nextInt();
	if(num==1) {
		logi();
	}else if(num==2) {
		newID();
	
	}else {
		System.out.println("잘못된 키입니다.");
		System.out.println();
	main();
	}}

void gamem() {


	System.out.println("      FishingGame");
	System.out.println("=====================");
	System.out.println("1.게임시작 2.상점 3.수족관 4.종료");
	System.out.print(">>");
	
	int num2=sc.nextInt();
	if(num2==1) {
		System.out.println("게임을 시작합니다.");
		
	}else if(num2==2) {
		System.out.println("상점으로 이동합니다.");
		shop.enterShop();
	}else if(num2==3) {
	System.out.println(lo[k].necname+"님의 수조관으로 이동합니다.");
	System.out.println();
	System.out.println(lo[k].necname+"님의 수조관");
	System.out.println("=====================");
	fishcase.fishroom();
	
	}else if(num2==4) {
		
		System.out.println("낚시터를 떠났습니다.");
		
	}else {
		System.out.println("잘못된 키입니다.");
		gamem();
	}
	
	}
	
	
}
















