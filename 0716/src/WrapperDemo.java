
public class WrapperDemo {
	public static void main(String[] args) {
//		int su = 5; //stack에 있는 5 
//		Integer in = new Integer(su); //감싼다 , Wrapping , Boxing //heap에 있는 객체 
//		int another = Integer.   //Unwrapping , UnBoxing
				
		int su= 5;
		Integer in = su * 100;  //Autoboxing
		int another = in ; // Autounboxing
		System.out.println(another);
	}
}
