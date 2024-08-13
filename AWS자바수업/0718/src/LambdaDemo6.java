
public class LambdaDemo6 {
	public static void main(String[] args) {
		Person3 jimin = new Person3();

		//1st Polymorphic parameter 를 이용하자.
//		jimin.greetiong(new Say3() {
//			@Override
//			public int something(int a, int b) {
//				System.out.println("I'm Jimin...");
//				System.out.println("Nice to meet you.");
//				return a * b;
//			}
//		} );

		//2st Lambda Expression 을 이용하자 
		jimin.greetiong(( a,  b) -> {
			System.out.println("I'm Jimin...");
			System.out.println("Nice to meet you.");
			return a + b;
			}
		 );
	}
}
@FunctionalInterface
interface Say3{
	int something(int a ,int b );
}
class Person3{
	public void greetiong(Say3 say) {
		int value = say.something(5,10);
		System.out.println("value =" + value);
	}
}