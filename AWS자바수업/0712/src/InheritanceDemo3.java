
// 4. 부모생성자는 상속되지 않는다.
// 자식 생성자는 부모의 기본 생성자만 호출한다.
// super() 메서드는 자식 생성자에서 임의로 부모 생성자를 호출할때 사용한다.
// 반드시 생성자 안에서만 사영해야 하고 , 생성자안에서 반드시 첫번째 위치해야한다.

public class InheritanceDemo3 {

	public static void main(String[] args) {
		Sonata sonata = new Sonata("EF Sonata", 30_000_000);
	}

}
class Car{  //final class 를 쓰면 상속을 못 함, 
	String name;
	int price;
	public Car(String name) {	this.name =name; 
	}
}
class Sonata extends Car{
	int price;
	public Sonata(String name , int price) { //super(name,price);  //부모의 다른 생성자만 호출할때는 super를 쓴다. 
	super(name); 
	//this(price);  //super와 this 둘다 처음으로 써야하는데 겹침으로 오류 발생. 
	this.price = price;
	}
}