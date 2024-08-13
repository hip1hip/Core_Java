
//동일 클래스의 맴버 메서드는 해당 클래스를 생성하고 그 주소로 접근해야 한다.

public class HelloWorld6 {
	public static void main(String[] args) {
		HelloWorld6 hw = new HelloWorld6();
		hw.print(); 
		// new HelloWorld6().print(); // 일회성으로도 사용가능. 
	}
	void print() {  //member , instance method -> 클래스를 생성하고 그 주소로 
		System.out.println("Hello , World");
	}
	
}
