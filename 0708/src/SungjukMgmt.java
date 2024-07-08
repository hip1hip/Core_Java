import java.util.Scanner;

public class SungjukMgmt {
	public static void main(String[] args) {
		Student chulsu = new Student(); //참조형은 무조권 8바이트 
		Scanner sc = new Scanner(System.in);
		String y_n = null; //지역변수니깐 널로 초기화 
		do {
			System.out.print("학번 : ");
			chulsu.hakbun = sc.next();
			System.out.print("국어 : ");
			chulsu.kor = sc.nextInt();
			System.out.print("영어 : ");
			chulsu.eng = sc.nextInt();
			System.out.print("수학 : ");
			chulsu.math = sc.nextInt();
			chulsu.tot = chulsu.kor + chulsu.eng + chulsu.math;
			chulsu.avg = chulsu.tot / (double)3 ;
			chulsu.grade = '\0';  //캐릭터라서 널값으로 최기화
			switch( (int)chulsu.avg/10) {  //실수로 나오니깐 점수에 10을 곱하고 int 로 바꾸면 된다 89.9 -> 8.99 를 인트하면 8남는다  
			case 10: case 9: chulsu.grade = 'A'; break;
			case 8: chulsu.grade = 'B'; break;
			case 7: chulsu.grade = 'C'; break;
			case 6: chulsu.grade = 'D'; break;
			default: chulsu.grade = 'F';
			}
			System.out.printf("%10s\t %5d\t %5d\t %5d\t %5d\t %.1f\t %3c %n",
							chulsu.hakbun, chulsu.kor , chulsu.eng , chulsu.math,
							chulsu.tot , chulsu.avg , chulsu.grade );
			System.out.println("Again(Y/N)");
			y_n = sc.next();		
		}while(y_n.equals("Y") || y_n.equals("y"));
		System.out.println("Program is over...");
	}

}
