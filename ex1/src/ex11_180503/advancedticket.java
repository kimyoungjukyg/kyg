package ex11_180503;
import ex11_180503.ticket;
public class advancedticket extends ticket{
	public advancedticket(int cost,String on) {
		super();
	}
	
	
	public int day;
	
	public String ay() {
		if(day>=5) {
			on="사전예약";
		}else{
			on="일반";
		}
		return on;
		}
	public int dday() {
		if(day>=30) {

			cost=cost/2	;
			
		}else if(day>=10) {
			
			cost=(cost*8)/10;
		}else if(day>=5) {
			
			cost=(cost*9)/10;
		}
		return cost;
		
	}
	
	
	
}
