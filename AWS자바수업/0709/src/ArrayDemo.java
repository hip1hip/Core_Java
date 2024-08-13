import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		int [] array = new int[4]; //자동으로 값이 들어감 , 방이 비어있지 않음 기본타입이라서 0으로 자동으로 초기화됨. 
		//double 은 0.000000 으로 자동 초기화됨;
		for(int i= 0 ; i < 4 ; i ++) {
			System.out.println(array[i]);
		}
		
	}
}


