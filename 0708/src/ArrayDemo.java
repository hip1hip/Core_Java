
public class ArrayDemo {

	public static void main(String[] args) {
//		int [] array; 
//		array = new int[4];
//		array[0]=5; array[1]=6; array[2]=7; array[3]=8; 
//		for(int i=0; i<4 ; i++) {
//			System.out.println("array[" + i + "] = " + array[i] +"\t");
//		}
//		System.out.println();
		
		String [] array = {"Hello" , "World", "Good" , "Java", "A" }; //해당 주소는 array가 알고 있음 . 
		array[3] = "Python";
		for (int i=0; i<5; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
				
		
	}
}
