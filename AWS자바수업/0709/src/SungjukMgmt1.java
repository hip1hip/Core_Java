import java.util.Scanner;

public class SungjukMgmt1 {

	public static void main(String[] args) throws java.io.IOException {
		Student [] stdArray = new Student[3]; //앞으로 학색들의 정보가 저장될 공간 확보
		Scanner sc = new Scanner(new java.io.File("sungjuk.dat"));
		for (int i = 0 ; i < 3 ; i++) {
			stdArray[i] = new Student(); //비로소 여기서 학생 생성 
			String line = sc.nextLine(); //2024-001	한지만	100	80	70
			//Parsing
			String [] array = line.split("\\s+");
			stdArray[i].hakbun = array[0].trim(); //학번
			stdArray[i].name = array[1].trim();  //이름
			stdArray[i].kor = Integer.parseInt(array[2].trim());  //국어
			stdArray[i].eng = Integer.parseInt(array[3].trim());  
			stdArray[i].math = Integer.parseInt(array[4].trim()); 
		}
		int j =0 ; //초기화 
		while(j<3) {
			System.out.printf("%10s\t %10s\t %5d\t %5d\t %5d %n",
					stdArray[j].hakbun, stdArray[j].name, stdArray[j].kor, stdArray[j].eng, stdArray[j].math);
			j++;
		}
		
	}

}
