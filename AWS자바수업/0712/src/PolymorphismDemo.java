/*
 * 다형성
 * 1. 객체 형변화 - 부모와 자식 관계에서만 가능함, 
 * 	1) 자동 형변환 - 자식객체가 부모객체로 형변환할 때.
 * 	2) 강제 향변환 - 부모객체가 자식객체로 형변환할 때, 단, instanceof 연산자가 true를 리턴할 때만 가능. 
 * 2.Override method  오버라이드 메서드 
 */


public class PolymorphismDemo {
	public static void main(String[] args) {
//		int su = 5;
//		long lo = su; //자동 형변환 , implicit , conversion , promotion
//		double avg = su;
//		short sh = (short)avg //강제향변환 , explicit , conversion
		Test t = new Test();
		Demo d = new Demo();
		// t = d;
		if(t instanceof Demo) {  
		d = (Demo)t; //부모는 자식으로 변환은 안된다, 강제 형변환을 해야함. 
		}else {
			System.out.println("안돼");
		}
	}

}
class Test{ Test(){} }
class Demo extends Test{}