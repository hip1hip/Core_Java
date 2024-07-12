
//1. overshadow 변수 , override 메서드는 상속되지 않는다. 

public class InheritanceDemo {

	public static void main(String[] args) {
		Horse h = new Horse(); 
		//h.display(); // Horse 에 display는 없지만 상속관계로 사용 가능하게함. 
		System.out.println(h.toString());  // 런값 =Horse@28a418fc 을 재정의하여 오버라이드하여 값을 변경 할 수 있음.
											//		@Override
											//		public String toString() { //할아버지 obj 꺼를 재정의 하는거
											//			return "나는 제주말입니다";
											//		}


	}

}


//class Mammal{
//	public void display() {
//		System.out.println("나는 포유류");
//	}
//}
//
//class Horse extends Mammal{  //Mammal 부모
//	@Override
//	public String toString() { //할아버지 obj 꺼를 재정의 하는거
//		return "나는 제주말입니다";
//	}
//	@Override
//	public void display() {
//		super.display();  // 오버라이드(이름이같은) 때 슈퍼를 쓰면 부모꺼를 쓸 수 있음. 
//		System.out.println("나는 제주말이야");
//	}  //메서드가 같은면 자식의 자료만 씀, 상속이 안됨. 오버라이드 메서드. 
//}  


