
public class InterfaceDemo {
	public static void main(String[] args) {
		//Mammal m = new Mammal(); //new 생성을 할 수 없음
		//5. interface 도 추상클래스 처럼 인스턴스화가 안된다. 
//		Mammal m = new Dog(); m.display();
//		Mammal m1 = new Cat(); m1.display();
//		Mammal.PI = 3.15;  // 상수이기에 바꿀 수 없음. 
		Mammal1 [] array = new Mammal1[2]; //new 는 배열 주소를 만듬
		array[0] = new Dog();
		array[1] = new Cat();  //자식인 개나 고양이는 형변환함 
		for(Mammal01 m : array) m.display();
	}
}	
public interface Mamma1 { //인터페이스는 변수 생성자 바디(겥터세터) 를 가질 수 없다, 따라서 abstract 메서드만 남는다. 
	//1.public static final 이 생략된 상수만 가질 수 있다. 
	int mon = 0;
	int tue = 0;
//  private 는 오류
//  int mon; -> 변수는 가질수 없음, 
	double PI = 3.141596;
// 	2. public abstract 이 생략된 추상메서드만을 가질 수  있다, 
	void display();
}

// 3. interface를 구현시 implements 키워드 사용한다, 
class Dog implements Mammal1{ //이종상속이라서 extends 이 아니라 implements 키워드사용 
	//4. interface 추상메소드를 재정의시 반드시 pubilc이여야함, 
	@Override
	public void display() {   //public 를 써야함, 부모에 생략되어있음, 
		System.out.println("개에 맞게 재정의된 메서드");
	} 
	
}

class Cat implements Mammal1{
	@Override
	public void display() {  
		System.out.println("고양이에 맞게 재정의된 메서드");
	}
}