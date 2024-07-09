
//동일 클래스에 있는 스태틱 변수는 클라스 이름을 생략할 수 있다. 


public class HelloWorld1 {
	static String str = "Hello, World"; //instance , member variable (스테틱이 없을때, 실행오류 , 메인이 스테틱이라서 둘다 스테틱이여야함. 
	//static 을 쓰면 공유 변수가 됨 , class , static variable 
	public static void main(String[] args) {
		//String str = "Hello, World"; // local , stack , temporary , auto variable 
		System.out.println(Demo.str);
		System.out.println(HelloWorld1.str);
		
	}

}
class Demo {
	static String str = "Python 이얌 ";
	
}
