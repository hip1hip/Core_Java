
public class LambdaDemo4 {
	public static void main(String[] args) {
		Person1 jimin = new Person1();
/*	
		//1st Polymorphic parameter 를 이용하자.
		jimin.greetiong(new Say1() {
			@Override
			public int something() {
				System.out.println("I'm Jimin...");
				System.out.println("Nice to meet you.");
				return 100;
			}
		} );
*/
		//2st Lambda Expression 을 이용하자 
		jimin.greetiong something(() -> {
				System.out.println("I'm Jimin...");
				System.out.println("Nice to meet you.");
				return 200;
			}
		} ));
}
@FunctionalInterface
interface Say1{
	int something();
}
class Person1{
	public void greetiong(Say say) {
		int value = say.something();
		System.out.println("value =" + value);
	}
}