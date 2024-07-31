

public class OuterClass2 {
	public static void main(String[] args) {
		OuterClass2 oc = new OuterClass2();
		oc.display();
	}
	void display() {
		int a= 5;  //local variable
		class InnerClass2 { //local class
			int b = 100;  //local inner class's member variable
			static int c = 500; // local inner class's static variable
			void print() {
				
			}
		} 
		InnerClass2 ic = new InnerClass2();
		System.out.println(ic.b);  //why? 맴버변수니깐. 
		System.out.println(InnerClass2.c); //why? 스태틱이니깐... 
	}
}
