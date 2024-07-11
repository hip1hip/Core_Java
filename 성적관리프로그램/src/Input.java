import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input { //생성자는 필드를 초기화 함. 
	private Scanner sc; //member
	private Student [] array; // field
	public Input(Student[] array) throws FileNotFoundException {
		this.sc = new Scanner(new java.io.File("sungjuk_utf8.txt"));
		this.array = array;
	}
	void input() {
		for(int i = 0; i < this.array.length; i++) {
			String line = this.sc.nextLine();
			//문자열 파싱을 String [] = String 클래스의 split(정규식)
			Scanner s = new Scanner(line).useDelimiter("\\s+");  //  \\s+ 스페이스 공백 하나로 짜르기
			String hakbun = s.next();  // 1101 이 들어가고 
			String name = s.next();
			int kor = s.nextInt();
			int eng = s.nextInt();
			int mat = s.nextInt();
			int edp = s.nextInt();
			this.array[i] = new Student(hakbun,name,kor,eng,mat,edp);
			
		}
	}

}
