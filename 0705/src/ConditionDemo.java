import java.util.Scanner;

public class ConditionDemo {

	public static void main(String[] args) {
		System.out.print("Favorite Season (spring , summer , fall , winter) : ");
		Scanner sc = new Scanner(System.in);
		String season = sc.nextLine();
		switch(season) {
		case"spring":System.out.println("봄 : 개나리 , 진달래 "); break;
		case"summer":System.out.println("여름 : 여름꽃 ");break;
		case"fall":System.out.println("가을 : 가을꽃  "); break;
		default : System.out.println("겨울 : 겨울꽃   ");break;
		}
		
		
		
//		if(season.equals("spring") ) {  //equals()는 String class 의 맴버 메소드이기 때문에 , 주소가 필요하다. 
//			System.out.println("봄 : 개나리 , 진달래 ");
//		}else if (season.equals("summer")) {
//			System.out.println("여름 : 여름꽃 ");
//		}else if (season.compareTo("fall") == 0 ){
//			System.out.println("가을 : 가을꽃  ");
//		} else {
//			System.out.println("겨울 : 겨울꽃   ");
		
	}

}
