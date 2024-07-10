import java.util.Scanner;

public class SungjukMgmt {

	public static void main(String[] args) {
		Student younghee = new Student();
		//CallbyRefDemo1 d = new CallbyRefDemo1();
		
		new Input().input(younghee); // Input 클래스 안에 input 메서드 / 맴버 변수라서 new 주소를 새로 해줘야함.  
		new Calc().calc(younghee);
		new Output().output(younghee);
	}
}



	//std 지역변수로 동일한 이름을 써도 된다. 
//	void input(Student std) {  //std  = younghee , Call by Ref 
//		Scanner sc = new Scanner(System.in);
//		System.out.print("학원 : "); std.hakbun = sc.next();
//		System.out.print("국어 : "); std.kor = sc.nextInt();
//		System.out.print("영어 : "); std.eng = sc.nextInt();
//		System.out.print("수학 : "); std.math = sc.nextInt();
//		
//	}
//	void calc(Student std) {
//		std.tot = std.kor + std.eng + std.math;
//		std.avg = std.tot /3.;
//		std.grade = (std.avg >=90)?'A':(std.avg>=80)? 'B': (std.avg>=70)? 'C': (std.avg>=60)?'D' : 'F';
//	}
//	void output(Student std) {
//		System.out.println("학번\t국어\t양어\t수학\t총점\t평균\t평점\t");
//		System.out.println("---------------------------------------------");
//		System.out.printf("%-10s %5d%5d%5d%5d %7.1f %3c%n",
//				std.hakbun,std.kor,std.eng,std.math,std.tot,std.avg,std.grade);
//		
//	}







