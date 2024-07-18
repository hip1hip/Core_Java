
public class LambdaDemo3 {
	public static void main(String[] args) {
		Person jimin = new Person();
		
/*		//1st Polymorphic parameter 를 이용하자.
		jimin.greetiong(new Say() {
			@Override
			public void something() {
				System.out.println("I'm Jimin...");
				System.out.println("Nice to meet you.");
			}
		} );
*/
		//2st Lambda Expression 을 이용하자 
		jimin.greetiong(() -> {
				System.out.println("I'm Jimin...");
				System.out.println("Nice to meet you.");
			}
		 );
	}
}
@FunctionalInterface
interface Say{
	void something();
}
class Person{
	public void greetiong(Say say) {
		say.something();
	}
}