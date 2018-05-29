package ex8_180525;

public class ch6_22_member {
	String id;
	String pas;
	
	
	
	boolean login(String id,String pas){
		if(id.equals("yourid") && pas.equals("12345"))
		{
		return true;
		}
		else{return false;}
	}
		void logout(String id) {
			if(id.equals("yourid")){
				System.out.println("yourid님이 로그아웃되었습니다.");
			}else {
				System.out.println("로그아웃실패");
			}
		}
	
	
	
	
}
