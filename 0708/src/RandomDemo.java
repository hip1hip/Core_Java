
public class RandomDemo {

	public static void main(String[] args) {
		
		// 1~10 까지의 랜덤 넘버 츠ㅡ출 
		int rand = (int)(Math.random() * 10 + 1 );
		//랜덤넘버는 0.0 ~ 1.0임 따라서 최댓값을 곱하고 최솟값을 더해야함. 하고 강제 형변형까지 해야함 
		System.out.println("rand = " + rand );
		switch(rand) {
		case 1: System.out.println("Banans"); break;
		case 2: System.out.println("Oranges"); break;
		case 3: System.out.println("Peach"); 
		case 4: System.out.println("Apple"); 
		case 5: System.out.println("Plums"); break;
		case 6:	System.out.println("Pineapples"); break;
		case 7:	System.out.println(); break;	
		default : System.out.println("Nuts");
		}
	}

}
