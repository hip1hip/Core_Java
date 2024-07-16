
public class AnonymousClassDemo3 {
	public static void main(String[] args) {
		AnonymousClassDemo3 acd = new AnonymousClassDemo3();
//		Dog dog = new Dog();
//		acd.dispaly(dog);
		acd.dispaly(new Mammal() {
			public void sound() {
				System.out.println("멍멍멍멍");
			}
		});
	}
	void dispaly(Mammal m) {
		m.sound();
		
	}
}

interface Mammal{
	void sound();
}
class Dog implements Mammal{
	public void sound() {

	}
}