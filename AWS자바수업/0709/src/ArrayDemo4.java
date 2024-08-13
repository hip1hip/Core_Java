
public class ArrayDemo4 {
	public static void main(String[] args) {
		double[] array = {3.14 , 89.5 , 182.5 , 69.2};
//		for(int i=0; i< array.length; i++) {
//			System.out.printf("%.2f%n", array[i]);
//		}
		//Enhanced For 향산된 for / for가 몇 번 돌아야 할지 알아야 쓸 수 있음, 
		// 몰라도 쓸 수 있게끔 첨부터 끝까지 루프함. 
		for (double aaa : array) {
			System.out.println(aaa);
			//컬렉션과 배열에서만 쓴다, 언제부터 언제까지인지를 표현할 수 없음 . 
		}
	}
}
