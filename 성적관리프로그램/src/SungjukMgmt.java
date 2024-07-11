import java.io.FileNotFoundException;

public class SungjukMgmt {
	public static void main(String[] args) throws FileNotFoundException {
		//메인은 제일 마지막에 만드는거 처음은 Student 
		Student [] array = new Student[12]; //12명의 학생이 저장될 수첩
		Input input = new Input(array); //(array) 학생의 주소를 넘긴다
		input.input();
		Calc calc = new Calc(array);
		calc.calc();
		Output output = new Output(array);
		output.output();
		System.out.println("Program is over .....");
	}
}
