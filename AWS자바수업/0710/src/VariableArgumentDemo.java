
public class VariableArgumentDemo {
	public static void main(String[] args) {
		VariableArgumentDemo vad = new VariableArgumentDemo();
//		int[] array = {3,4,5};
		int a = 5 ;
		char b = 'B';
		boolean c = true;
		double avg = 89.9; 
		String name = "한지민";
		vad.change(a,b,c,avg , name); //argument , 인자 (인수) 넘어가는 
	}
	void change(Object ... A) { // parameter , 매개변수 받는
		 // ... 배열이 아닌 걸 배열로 받고 싶을때 쓴다.  
		System.out.println(A.length);  // ...은 배열이니깐 length 를 쓸 수 있다.
		
//		for(Object su : A) {
//			System.out.println(su);
//		}
	}
}
