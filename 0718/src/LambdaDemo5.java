
public class LambdaDemo5 {
	public static void main(String[] args) {
		Person2 jimin = new Person2();

//		//1st Polymorphic parameter 를 이용하자.
//		jimin.greetiong(new Say2() {
//			@Override
//			public int something(int a) {
//				System.out.println("I'm Jimin...");
//				System.out.println("Nice to meet you.");
//				return a * 10;
//			}
//		} );

		//2st Lambda Expression 을 이용하자 
		jimin.greetiong((a) ->  {
			System.out.println("I'm Jimin...");
			System.out.println("Nice to meet you.");
			return a * 10;
		}
	
	);
}}
@FunctionalInterface
interface Say2{
	int something(int a );
}
class Person2{
	public void greetiong(Say2 say) {
		int value = say.something(5);
		System.out.println("value =" + value);
	}
}