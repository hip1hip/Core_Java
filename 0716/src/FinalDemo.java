
public class FinalDemo {
	public static void main(String[] args) {
		Parent bumo = new Jasik(); 
		bumo.display();
	}
}
class Parent {
	public final void display() {  // final 이 들어가면 상속 불가 ,  재정의도 불가. 
		System.out.println("나는 부모의 메서드 ");
	}
	
}
class Jasik extends Parent {
	public void display() {
		System.out.println("나는 자식 메서드 ");
	}
}