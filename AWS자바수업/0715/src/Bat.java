
public class Bat extends Mammal implements Birds {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("하늘을 날다");
		
	}

	@Override
	public  void giveBirthto() {
		// TODO Auto-generated method stub
		System.out.println("새끼를 낳다");
		
	}
	public static void main(String []args) {
		Bat bat = new Bat();
		bat.fly();
		bat.giveBirthto();
	}

}
