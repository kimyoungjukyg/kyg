package ex14_180604;

import java.util.*;

//Ishop 인터페이스의 구현클래스
public class Myshop implements Ishop{
	
	//회원 정보 들록을 위한 배열선언
	User[] users=new User[2];
	
	
	//상품정보등록을 위한 배열선언
	Product[] products=new Product[4];
	
	
	//상품 추가를 위한 장바구니
	ArrayList<Product> cart=new ArrayList<Product>();	
	
	Scanner scan=new Scanner(System.in);
	
	int selUser;
	
	String title;
	

	
	
	@Override
	public void setTitle(String title) {
	this.title=title;	
		
		
	}

	@Override
	public void genUser() {
	User user=new User("사용자1",PayType.CARD); 
		users[0]=user;
		user=new User("사용자2",PayType.CASH); 
		users[1]=user;
		
	}

	@Override
	public void genProduct() {
		cellPhone cp=new cellPhone("갤럭시S9",10000000,"SKT");
		products[0]=cp;
		cp=new cellPhone("애플",98000000,"KT");
		products[1]=cp;
		smartTv st=new smartTv("삼성 3D",5000000,"4K");
		products[2]=st;
	 st=new smartTv("LG Smart Tv",25000000,"FUll HD");
		products[3]=st;
		
		
		
	}

	@Override
	public void start() {
		
		System.out.println(title+": 메인화면 - 계정선택");
		System.out.println("========================");
		int i=0;
		for(User u:users) {
			
			System.out.println("["+(i++)+"]"+u.getName()+u.getPayType());}
		
		
		
		/*for(int i=0;i<users.length;i++) {
			System.out.println("["+i+"]"+users[i].getName()+users[i].getPayType());
			
			
		}*/
		System.out.println("[x]종료");
		System.out.print("선택: ");
		String sel=scan.next();
	
		System.out.println("## "+sel+"선택##");
		
		switch(sel) {
		case "x" :System.exit(0);
		break;
		default:
			selUser=Integer.parseInt(sel);
			productList();
		
	
		}
		
		
		
		
	} 
	private void productList() {
		
		System.out.println(title+": 상품 목록-상품선택");
		System.out.println("========================");
		int i=0;
		for(Product p:products) {
			
			System.out.print("["+(i++)+"]");
			p.printDetail();
		
			}
		
		
		System.out.println("[h]메인화면");	
		System.out.println("[c]체크아웃");
		System.out.print("선택: ");
		String sel=scan.next();
		System.out.println("## "+sel+"선택##");
		
		switch(sel) {
		case "h" : start();
		break;
		case "c" : checkOut();
		break;
		default:
			int psel=Integer.parseInt(sel);
			//cart에 요소값저장
			cart.add(products[psel]);
			productList();
			
		}
			
		
	
		}
		public void checkOut() {
			System.out.println(title+" : 체크아웃");
			System.out.println("========================");
			int total=0;
			int i=0;
			//장바구니에 담긴 상품 정보 출력
			for(Product p:cart) {
				System.out.println("["+(i++)+"]"+p.pName+"  "+p.price);
			total=total+p.price;
			
			}
			System.out.println("========================");
			System.out.println("결제 방법: "+users[selUser].getPayType());
		System.out.println("합계: "+total+"원 입니다.");
		System.out.println("[p]이전, [q]결제완료");
		System.out.print("선택: ");
		String sel=scan.next();
		switch(sel) {
		case "p" :
			productList();
		break;
		case "q" :
			System.out.println("##결제가 완료되었습니다.종료됩니다.");
			System.exit(0);
			break;
			default :
				checkOut();
		}
		
		
		}
	}
	
	
	

