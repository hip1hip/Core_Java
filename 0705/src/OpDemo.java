
public class OpDemo {

	public static void main(String[] args) {
		// next int 
		//값 입력 (초단위) : 3601
		//3601초는 1시간 1초입니다.  시분초로 출력으로 나오게 하기 
		
//		3600초는 1시간 1시간은 60분 60초는 1분 
//		값을 60초로 나누고 나머지가 60분 이상일 때 또 60분으로 나눈다. 그 나머지는 시간. 
		
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int time , ho , mi , se  ; 
		System.out.print("값 입력 : "); 
		time = sc.nextInt();
		ho = time / 3600 ;
		mi = time % 3600 /60 ; 
		se = time % 3600 % 60; 
			
		
		
		System.out.printf("입력 초는 %d ,  %d 시간 %d분 %d초 입니다. \n", time , ho , mi , se  );

	}

}
