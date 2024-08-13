import java.util.Random;
import java.util.stream.IntStream;

/*
 *  java.lang.IllegalStateException 에러 발생
 *  1. 한번 사용한 Stream은 재상요할 수 없는 일화성 객체이기 때문이다.
 *  2. 따라서 필요하다면 다시 생성헤야한다.
 */

public class StreamDemo1 {

	public static void main(String[] args) {
//		IntStream is = IntStream.rangeClosed(1, 100); // 스트림 생성 
//		int sum = is.sum();  //최종연산 
//		long count = is.count(); // 최종연산
		
		
		//1 ~100 랜덤 난수를 발생하여 중복을 배제하고 5개를 추출하고 소팅까지 수행하는 방법. 
		IntStream sotedInt = new Random().ints(1,100).distinct().limit(5).sorted();
		sotedInt.forEach(i -> System.out.print(i + " , "));
		
	}

}
