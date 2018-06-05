package ex12_180531;

public class B_countablex {
	public static void main(String[] args) {
	B_countable[] m= {new B_bird("뻐꾸기",1),new B_bird("독수리",2),
			new B_tree("사과나무",3),new B_tree("밤나무",4)};
	
	for(B_countable e:m) 
				e.count();
	
	
	
	for(int i=0;i<m.length;i++) {
					if(m[i] instanceof B_bird) {
						((B_bird)m[i]).fly();
					}else {
						((B_tree)m[i]).ripen();	}
					
					
				}
	}}

