package stream;

public class 태민_Customer {

	String id;
	String nm;
	String grade;
	int point;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public 태민_Customer() {
	}
	
	public 태민_Customer(String id, String nm, String grade, int point) {
		super();
		this.id = id;
		this.nm = nm;
		this.grade = grade;
		this.point = point;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", nm=" + nm + ", grade=" + grade + ", point=" + point + "]";
	}
}
