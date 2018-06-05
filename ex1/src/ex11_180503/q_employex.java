package ex11_180503;

public class q_employex {
public static void main(String[] args) {
	/*q_employee em=new q_employee(null,0,null);
	q_manager ma=new q_manager(null, 0, null, 0);
	q_executive ex=new q_executive(null, 0, null, 0, 0);
	em.name="김신입";
	em.price=250;
	em.position="신입";
	ma.name="김과장";
	ma.price=450;
	ma.position="과장";
	ma.add=50;
	ex.name="김이사";
	ex.price=1000;
	ex.position="이사";
	ex.add=100;
	ex.option=50;*/
	q_employee em=new q_employee("김신입",250,"신입");
	q_manager ma=new q_manager("김과장", 450, "과장", 50);
	q_executive ex=new q_executive("김이사", 1000, "이사", 100, 50);
	
	

	
	System.out.println("직원의 이름: "+em.name+" ,급여: "+(int)em.price+" ,인상급여: "+(int)em.rise()+"만원 ,직책: "+em.position);
	System.out.println("직원의 이름: "+ma.name+" ,급여: "+(int)ma.price+"만원 ,인상급여: "+(int)ma.rise()+"만원 ,직책: "+ma.position+" ,보너스: "+ma.add+"만원");
	System.out.println("직원의 이름: "+ex.name+" ,급여: "+(int)ex.price+"만원 ,인상급여: "+(int)ex.rise()+"만원,직책: "+ex.position+" ,보너스: "+ex.add+"만원 ,스톡옵션: "+ex.option);
}
}
