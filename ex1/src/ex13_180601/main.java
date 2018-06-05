package ex13_180601;

import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<String,String> map=new HashMap<String,String>();
		
		map.put("sad","슬픔");
		map.put("apple","사과");
		map.put("only","오직");
		map.put("give","주다");
		map.put("take","가지다");
		
		while(true) {
			System.out.println("단어를 입력하세요");
			String eng=sc.nextLine();
			
			String kor=map.get(eng);
			if(kor==null) {
				System.out.println("사전에 없는단어입니다.");
			}else {
				System.out.println("단어의 의미는 "+kor+" 입니다.");
			}
		}
	}
	

}
