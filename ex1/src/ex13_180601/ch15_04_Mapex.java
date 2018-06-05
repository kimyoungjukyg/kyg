package ex13_180601;

import java.util.*;

//Map예제
public class ch15_04_Mapex {

	public static void main(String[] args) {
		Map<String,Integer> map =new HashMap<String,Integer>();
		map.put("학생1",100);
		//넣는내용 순서지켜야함
		//map.put(100,"50");
		map.put("학생2",90);
		map.put("학생3",60);
		map.put("학생4",80);
		map.put("학생5",30);
		System.out.println("Map에 저장된 데이터수: "+map.size());
		
		//특정 데이터 찾기(인덱스를대신하는것:key)
		//특정값출력
		System.out.println(map.get("학생2"));
		
		//모든값출력하기
		Set<String> keySet=map.keySet();
		Iterator<String> keyIterator =keySet.iterator();
		while(keyIterator.hasNext()) {
			String key=keyIterator.next();
			Integer value=map.get(key);
			System.out.println(key+":"+value);
		}
	}

}
