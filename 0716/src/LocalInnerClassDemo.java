
public class LocalInnerClassDemo {
	public static void main(String[] args) {
//		InnerCalss ic = new InnerCalss();
		OuterClass out = new OuterClass();
	}
}

class OuterClass{
	private int a= 5;
	private static int b = 10;
	public void display() {
		int c = 100;
		class InnerCalss{
			public void print() {
				System.out.println(c);
				
			}
		}
		InnerCalss ic = new InnerCalss();
		ic.print();
	}
	
}


