package ex13_180601;
import java.util.*;
//Arraylist 예제
public class ch15_01_Arraylistex {

	public static void main(String[] args) {
		//Arraylist선언
		List<String> list =new ArrayList<String>();
		//<>:제네릭(Generic)(번거로운 타입변환을 제거해주는 역활)
		
		/*
		 *<>(제네릭)사용안할시:(기존방식)
		 *List list=new ArrayList();
		 *list.add("홍길동");
		 *
		 *object obj=list.get(0);
		 *String name=(String)obj;
		 *
		 * 
		 */
		/*list.add("홍길동");
		String name=list.get(0);
		System.out.println(name);*/
		
		//리스트객체에 데이터 저장하는메소드 add()
		list.add("java");
		list.add("jdbc");
		list.add("servlet/jsp");
		list.add(2,"database");
		list.add("mybatis");
		
		int size=list.size();
		System.out.println("list 객체의 크기"+size);
		System.out.println();
		
		
		String skill =list.get(2);
		System.out.println("2번 인덱스에 담긴 데이터: "+skill);
		System.out.println();
		
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i));
		}
		//list에담긴데이터 삭제
		list.remove(2);//database
		//없어진부분에자동으로당겨짐
		list.remove(2);//servletjsp
		list.remove("jdbc");//지정삭재

		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i));
		}
		
		
	}

}
