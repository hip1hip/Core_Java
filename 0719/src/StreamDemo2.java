//reduce()   누적힐때 /총합을 구할때 많이 씀 

import java.util.stream.IntStream;

public class StreamDemo2 {
	public static void main(String[] args) {
		IntStream is =  IntStream.range(1, 101);  //스트림 생성 
		int total = is.reduce(0, (a,b) -> a + b);   //0부터 ~~ 
		System.out.println(total);
	}
}
