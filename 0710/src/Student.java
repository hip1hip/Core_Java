
public class Student {
	//public String hakbun, name; // public 하면 완전공개 0709 , 0708 등등 에서도 사용 가능 
	private String hakbun;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private char grade; //private 보안과 숨김 기능까지 겸함. 
	
	public void print() {
		System.out.printf("%-10s %5d%5d%5d%5d %7.1f %3c%n",
		hakbun,kor,eng,math,tot,avg,grade);
	}
	
	
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
}
