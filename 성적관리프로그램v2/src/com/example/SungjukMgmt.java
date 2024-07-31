package com.example;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class SungjukMgmt {
	public static void main(String[] args) throws FileNotFoundException {
		//메인은 제일 마지막에 만드는거 처음은 Student 
		
		List<StudentVO> list = new ArrayList<StudentVO>();
		Input input = new Input(list); //(array) 학생의 주소를 넘긴다
		input.input();
		Calc calc = new Calc(list);
		calc.calc();
//		Sort sort = new Sort(list);
//		sort.quickSortiong();
		Output output = new Output(list);
		output.output();
		System.out.println("Program is over .....");
	}
}
