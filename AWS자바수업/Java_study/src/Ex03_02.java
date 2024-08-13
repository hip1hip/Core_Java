import java.util.Scanner;

public class Ex03_02 {
	public static void main(String[] args) {
		double num1 , num2 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수: " );
		num1 = sc.nextDouble();
		System.out.print("두번째 수: " );
		num2 = sc.nextDouble();
		
		double num3 = num1 / num2 ;
		
		System.out.println("--------------------------------");
		if (num2 != 0.0) {
			System.out.println("결과:  " + num3 );
		} else {
			System.out.println("결과 : 무한대");
		}
			
		
		
	}
}
