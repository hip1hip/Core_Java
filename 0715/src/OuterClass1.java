//member inner class

public class OuterClass1 {
	public static void main(String[] args) {
		OuterClass1.InnerCalss1 ic = new OuterClass1.InnerCalss1();
		ic.display();
		ic.print();
	}
	
	private int a= 5; //outer class's member variable
	private static int b = 10; // outer class's static variable
	private static class InnerCalss1{  // static inner class
		private int c = 100; // static inner class's member variable
		private static int d = 500; // static inner class's static variable
		public void display() { // static inner class's member method
			System.out.println(b + c + d); //a는 바깥쪽 주소가 필요함 
			
		}
		public static void print() { //static inner class's static method 
			System.out.println(b + d); // a,c는 불가함 스태틱은 맴버변수애 접근 불가 
		}
	}
}
