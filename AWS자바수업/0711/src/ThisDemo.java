//this 자기 자신의 주소를 가르킴. 
/*
 * 1. this. : 나의 주소 / 주소로 부터 
 * 2. this  : 나 
 * 3. this() : 나의 생성자 
 */

public class ThisDemo {

	public static void main(String[] args) {
		Car sonata = new Car();
		sonata.setName("소나타");
		sonata.setPrice(30_000_000);
		System.out.println("이름 =" + sonata.getName());
		Car matiz = sonata.clone();  // 주소복사
		System.out.println(matiz.getName());
	}

}



