
public class StaticDemo1 {
	private int a; //맴버변수 
	private static int b = print(); //스테틱변수/ 제일 먼저 실헹됨 ,따라서 print도 먼저 실핼됨 
	public static void main(String[] args) {
		System.out.println("나는메인메서드");
	}
	void display() { //맴버메서드 
		
	}
	static int print() { //static 메서드  
		System.out.println("나는 스태틱 메서드 ");
		return 30_000_000;
		
	}
}
	

