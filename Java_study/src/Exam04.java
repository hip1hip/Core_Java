//222p 4번 for 문을 이용해서 배열항목에서 최댓값을 구하시오 
public class Exam04 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5,3,8,2};
		
		for(int i = 0; i <array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				
			}


		}
		System.out.println("max: " + max);
	}
}