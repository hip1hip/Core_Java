
public class Product {
	String name ;
	int price ;
	String maker;
	public Product() {};  //Product p = new Product(); 를 쓰기 위해 임의로 만듬 //오버로딩 상태, 파라미터가 다름 
	public Product(String name , int price, String maker) { //일반 생성사 
		this.name = name;
		this.maker = maker;
		this.price = price;
//		this.name = null; //기본 생성자 
//		this.maker = null;
//		this.price = 0;
	}
}
