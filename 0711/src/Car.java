
public class Car {
	 String name;
	 int price;
//	 public / privateee Car() {  //기본 디폴트 생성자  / 없어도 자동으로 만들어짐. 
//		 this.name = null;
//		 this.price = 0;
//	 }
	public void setName(String name) {
		this.name = name;  //name 으로 하면 null / 컴파일러가 맴버변수와 인자값을 구별할 수 없음, 
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	public Car clone() { //자동차 복제 (주소복사 ) 
		return this; //자기집 주소를 통채로 넘김 
		
	}
	
}
