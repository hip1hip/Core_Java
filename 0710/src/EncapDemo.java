	
public class EncapDemo {
	public static void main(String[] args) {
		Cars sonata = new Cars();
		//sonata.price = 30_000_000;
		sonata.setName("현다이 소나타"); 
		sonata.setPrice(30000000);
//		System.out.printf("이름은 = %s , 가격은 = %d%n", sonata.name , sonata.price);
		System.out.printf("이름 = %s, 가격은 = %d" + sonata.getName(),sonata.getPrice());
	}
}

class Cars {
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;  //this 는 자기 자신의 주소 
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
