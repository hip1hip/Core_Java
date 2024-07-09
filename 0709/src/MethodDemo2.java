/*
 * 메서드를 호출하는 3가지 방법 
 * 1. Call by Name
 * 2. Call by Value  단점 값 복사는 안된다. 
 * 3. Call by Reference - 해당 방법 / 주소를 넘겨야함(참조형)
 */

class Product {
	int price;
}

public class MethodDemo2 {
	public static void main(String[] args) {
		MethodDemo2 md = new MethodDemo2();
		Product ballpen = new Product(); 
		ballpen.price = 100;
		System.out.println("before = " + ballpen.price);
		
		md.change(ballpen); //Call by reference
//		int orginal = 100; 
//		md.print(orginal); //Call by Value
		System.out.println("after = " + ballpen.price);
	} 
	
	void change(Product pencil) { //pencil = ballpen
		pencil.price = 50000;
		
	}
//	void print(int target){  
//		System.out.println("target = " + target);
//		target = 50000;
//		System.out.println("target = " + target);
//}
}
