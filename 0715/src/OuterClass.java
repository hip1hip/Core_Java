//member inner class

public class OuterClass {
	public static void main(String[] args) {
		//InnerClass ic = new InnerClass();
		OuterClass oc = new OuterClass();
		OuterClass.InnerCalss ic = oc.new InnerCalss(); // 내부 클래스를 생성하는 방법 , oc.new / oc가 외부에서부터 접근해야함으로
		System.out.println(ic.c);  // 주소로 접근 
		System.out.println(InnerCalss.d); //static 접근 
		
	}
	
	private int a= 5; //outer class's member variable
	private static int b = 10; // outer class's static variable
	private class InnerCalss{  // member inner class
		private int c = 100; // inner class's member variable
		private static int d = 500; //inner class's static variable
		public void display() { //inner class's member method
			System.out.println(a + ", " + b + ", " + c + "," + d);
		}
		public static void print() {
			System.out.println(d); //inner class's static variable
			//System.out.println(a); 는 불가 스태틱은 멤버변수로 못 불러옴, 
		}
	}
}
