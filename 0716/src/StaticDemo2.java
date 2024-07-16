
public class StaticDemo2 {
	private int a;   // 맴버 변수 
	private final int B; //맴버 상수 
	private static int c;  //스테틱 변수 
	private static final int D;  // 스테틱 상수 
	
	{ //initialization block  /생성자 대신 초기화 / 맴버변수, 맴버상수 초기화 , 객체생성때마다 자동 호출 
		a = 5; B= 100;
	}
	static { //static initialization block/ 스태틱 변수 , 스태틱 상수 초기화 / class가 로딩시 단 한번 수행 
		c = 500; D = 1000;
	}
	
	public static void main(String[] args) {
		System.out.println(c + ", " + D);
	}
	void print() {
		int e; // 로칼뱐수 
		final int F; //로칼 상수 
	}
}
