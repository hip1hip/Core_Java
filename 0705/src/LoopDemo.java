import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {

		// 400년 마다 윤년이고 4로 나눠도 딱 떨어지나 100으로 나눠면 딱 안 떨어저야한다

		Scanner sc = new Scanner(System.in);
		System.out.print("Year: ");
		int year = sc.nextInt();
		if (year % 400 == 0 || (year % 4 == 0 & year % 100 != 0)) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("윤년이 아닙니다.");
		}
	}
}

// 1부터 100까지 4의 배수는 몇개인가.
//		int count =0;
//		for (int i =1 ; i <=100; i++) {
//			if(i % 4 == 0 ) {
//				count ++;
//			}
//		}
//		System.out.printf( "갯수는 %d\n", count);
//
//	}
//}
// A ~ Z 까지 출력하기
//		int i = 65; // 초기화 initialization  /1번
//		int count = 0;
//		for ( ; i<=90; ) {   //2번
//			System.out.printf("%c\t",(char) i );
//			count ++;
//			if (count % 5 == 0) {  //5의 배수라면 , 5개 마다 
//				System.out.println();
//			}
//			i++; 
//		}
//
//
//	}
//
//}
