package ex13_180601;

import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class ex1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	List<String> list=new ArrayList<String>();
	String name;
	
	for(int i=0;i<5;i++) {

	name=sc.nextLine();
	list.add(name);}
	//입력된사람들이름추출
	for(int i=0;i<list.size();i++) {	 
		String board=list.get(i);
		System.out.println(board);		 	
	}
	String lan=list.get(0);
	//긴이름출력
	/*int longname=0;
for(int i=1;list.size();i++){
if(list.get(longname).length()<list.get(i).lenght()){longname=i;}
	System.out.println(list.get(longname));	
	*/
	
	
	for(int i=0;i<list.size();i++) {	
		String board=list.get(i);
		if(board.length()>lan.length()) {
			lan=list.get(i);
		}
		
	}
	
	System.out.println("가장긴것: "+lan);
	}
}

