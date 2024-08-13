
public class ArrayDemo3 {
	public static void main(String[] args) {
//		//배열의 주소 복사 
//		int [] original = {3,4,5};
//		int [] target = original;
//		target[0] = 100; //주소복사는 간단함 
//		
//		int [] original = {3,4,5};
//		int [] target = new int[original.length];
//		target[0] = original[0]; 
		
		int [] original = {3,4,5};
		int [] target = new int[10];	
		System.arraycopy(original, 0, target, 0, original.length); //마지막은 몇개 가져올거야?
		//오리진의 몇번째의 타겟의 몇번쨰에 몇개를 가져올거야? 
		for (int i = 0; i<target.length; i++) {
			System.out.print(target[i] + ",");
		}
	}
}
