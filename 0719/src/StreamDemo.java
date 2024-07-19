import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;

public class StreamDemo {
	public static void main(String[] args) {
	 	int sum = IntStream.rangeClosed(1, 100).sum();
		long count = IntStream.rangeClosed(1, 100).count();
//		System.out.println(sum + " , "  + count);
		
		//1.0 ~ 100.0 까지 난수 15개 중 최댓값음 ?
		OptionalDouble max =  new Random().doubles(15L , 1.0 , 100.0).max();
		System.out.println(max.getAsDouble());
		
		
		
		
	}
}
