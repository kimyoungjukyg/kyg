package ex13_180601;

import java.util.*;

//set 예제 p.737
public class ch15_03_hashsetex {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("java");
		set.add("jdbc");
		set.add("servlet/jsp");
		set.add("database");
		set.add("mybatis");
		set.add("java");
		
int size=set.size();
//set은 중복은 안처줌
System.out.println("set에담긴 총 데잍너수: "+size);
		

//set에 들어있는 모든 데이터 가져오기
//반복자(Iterator)사용
Iterator<String> iterator=set.iterator();
while(iterator.hasNext()) {
	String element=iterator.next();
	System.out.println(element);
}set.remove("jdbc");
//set에있는 내용전부삭제
set.clear();
//set이비었는지확인
set.isEmpty();

	}

}
