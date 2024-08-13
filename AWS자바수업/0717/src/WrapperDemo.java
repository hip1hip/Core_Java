
public class WrapperDemo {
	public static void main(String[] args) {
//		// JDK 1.5 이전 
//		int su = 5;
//		Integer in = new Integer(su);  //Boxing
//		int another = in.intValue();   // Unboxing
//		System.out.println(another);
		
		// JDK 1.5 이후 
		int su = 5; 
		Integer in = su * 100;  // new Integer(su) 가 생략 되어있음 , Autoboxing
		int another = in;  //   in.intValue(); 가 생략 , Autounboxing
		System.out.println(another);
	}
	
}
