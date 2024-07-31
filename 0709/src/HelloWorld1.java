
//동일 클래스에 있는 스태틱 변수는 클라스 이름을 생략할 수 있다. 


public class HelloWorld1 {
	static String str = "Hello, World"; // class , static variable (스테틱이 없을때, 실행오류 , 메인이 스테틱이라서 둘다 스테틱이여야함. 
	
	public static void main(String[] args) {
		//String str = "Hello, World"; // local , stack , temporary , auto variable 
		System.out.println(Demo.str);
		System.out.println(str);
		
	}

}
class Demo {
	static String str = "Python 이얌 ";
	
}
