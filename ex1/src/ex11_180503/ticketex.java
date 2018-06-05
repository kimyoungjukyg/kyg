package ex11_180503;
import ex11_180503.ticket;
import java.util.Scanner;
public class ticketex {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ticket ti=new ticket();
	advancedticket ad=new advancedticket( 0, null);
	advancedticket ad2=new advancedticket( 0, null);
	advancedticket ad3=new advancedticket( 0, null);
	walkupticket wa=new walkupticket( 0, null);
	walkupticket wa2=new walkupticket( 0, null);
	System.out.println("티켓의 비용은?");
	ad.cost=sc.nextInt();
	wa.cost=ad.cost;
	ad2.cost=ad.cost;
	ad3.cost=ad.cost;
	wa2.cost=ad.cost;
	wa2.ticket=70;
	ad.ticket=2;
	ad2.ticket=3;
	ad3.ticket=1;
	wa.ticket=10;
	ad.day=5;
	ad2.day=10;
	ad3.day=30;
	wa.cash="사용";
	wa2.cash="미사용";
	ad.dday();
	ad.ay();
	System.out.println(ad.on+"티켓번호: "+ad.ticket+"번 "+"구매가격: "+ad.cost);
	ad2.dday();
	ad2.ay();
	System.out.println(ad2.on+"티켓번호: "+ad2.ticket+"번 "+"구매가격: "+ad2.cost);
	ad3.dday();
	ad3.ay();
	System.out.println(ad3.on+"티켓번호: "+ad3.ticket+"번 "+"구매가격: "+ad3.cost);
	wa.run();
	wa2.run();
	System.out.println(wa.on+"티켓번호: "+wa.ticket+"번 "+"구매가격: "+wa.cost+"신용카드사용여부: "+wa.cash);
	System.out.println(wa2.on+"티켓번호: "+wa2.ticket+"번 "+"구매가격: "+wa2.cost+"신용카드사용여부: "+wa2.cash);
}
}
