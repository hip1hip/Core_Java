import java.util.Scanner;

public class BmiDemo {

	public static void main(String[] args) {
//	    이름: 
//		신장(cm) :
//		몸무게(kg) :
//		
//		님은 BMI 자수 23.1이고 비만전단계입니다. 
//		
//		bmi = 체중 / 신장의 제곱

		
		System.out.print(" 이름 : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.print("신장(cm) :  ");
		Double height = sc.nextDouble();
		System.out.print("몸무게(kg) : ");
		Double weight = sc.nextDouble();
		
		double bmi = weight / (height*height) * 10000;
		System.out.printf("%s 님은 BMI 지수는 %.1f이고 ", name, bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중입니다. ");
		} else if (bmi >=18.5 && bmi <23 ) {
			System.out.println("정상입니다. ");
		} else if (bmi >=23 && bmi < 25 ) {
			System.out.println("비만 전단계입니다. ");
		} else if (bmi >=25 && bmi < 30 ) {
			System.out.println("1단계 비만입니다. ");
		} else if (bmi >=30 && bmi < 35 ) {
			System.out.println("2단계 비만입니다. ");
		} else System.out.println("3단계 비만입니다. ");
	}
}		

