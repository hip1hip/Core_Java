	//타입이 달라도 부모가 같으면 된다 
public class PolymophismDemo3 {
	public static void main(String[] args) {
//		Dog [] array = new Dog[3];
//		array[0] = new Dog();
		Mammal [] array = new Mammal[4];
		array[0] = new Dog();
		array[1] = new Cat();
		array[2] = new American();
		array[3] = new Korean();
		for (Mammal m : array) m.sayThing();
	}
}
