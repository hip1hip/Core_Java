// 생성자: 리턴 타입이 없다 , 이름은 못 바꾼다 클래스와 똑같아야한다 , 아무때나 호출 못한다 객체를 만들때만 호출한다. 
//생성자는 오버로딩 할 수 밖에 없다, 

public class ConstructorDemo {
	public static void main(String[] args) {
//		Car sonata = new Car();
//		System.out.println(sonata.name);
//		System.out.println(sonata.price);  //생성자가 하는일 초기화 new 로 생성자를 호출했을때 
		Product p = new Product();
		Product pencil = new Product("모나미연필",1000,"모나미사" );
		Product computer = new Product("shxmqnr",2_000_000,"LG gram");
		Product tv = new Product("텔레비전", 30_000_000, "삼성전다");
	}
}
