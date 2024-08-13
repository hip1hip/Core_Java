
public class ExceptionDemo3 {

	public static void main(String[] args) /*throws HistoryException*/ {
		Student chulsu= new Student(); 
			chulsu.setKor(90);
			try {
				chulsu.setHistory(120);
			} catch (HistoryException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(chulsu);
	}

}
class HistoryException extends Exception { //Checked Exception
	public HistoryException(String msg) {
		super(msg);
	}
}
class KoreanException extends RuntimeException { //Unchecked Exception
	public KoreanException(String msg) { //생성자 
		super(msg);
	}
}

class Student{
	private int kor;
	private int history;
	public void setHistory(int history) throws HistoryException {
		if(history >= 0 && history <= 100) this.history = history;
		else throw new HistoryException("역사점수는 0부터 100점까지 범위만 인정합니다."); 
	}
	public void setKor(int kor)  throws KoreanException {  // 메서드 선언부에 throws 를 쓴다. 
		if(kor >= 0 && kor <= 100) this.kor = kor;
		else throw new KoreanException("국어점수는 0부터 100점까지 범위만 인정합니다.");  // Exception 을 만들때 throw 쓴다 
		
	}
	public String toString() {
		return "kor = " + this.kor + ", history =" + this.history;
	}
}
