
//다른 클래스에 있는 맴버 변수는 속해 있는 클래스를 생성하고 그 주소로 접근한다. 

public class HelloWorld4 {
	public static void main(String[] args) {
		//String str = "Hello, World"; // local , stack , temporary , auto variable 
		Test t = new Test();
		System.out.println(t.str);
	}

}
class Test {
	String str = "Hello, World"; // member , instance variable  
}
