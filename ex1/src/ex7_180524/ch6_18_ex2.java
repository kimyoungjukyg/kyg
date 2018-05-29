package ex7_180524;

public class ch6_18_ex2 {
	private String name;
	private int assignmentscore;
	private int examscore;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAssignmentscore() {
		return assignmentscore;
	}
	public void setAssignmentscore(int assignmentscore) {
		this.assignmentscore = assignmentscore;
	}
	public int getExamscore() {
		return examscore;
	}
	public void setExamscore(int examscore) {
		this.examscore = examscore;
	}
	
	void result() {
		System.out.println("이름: "+name);
		System.out.println("과제점수: "+assignmentscore);
		System.out.println("시험 점수: "+examscore);
		System.out.println("학점: "+get());
	}
	public String get() {
		String gra;
		double avg=(this.assignmentscore+this.examscore)/2;
		if(avg>=90) {
			gra="A";
		}else {
			gra="B";
		}return gra;
	}
}
