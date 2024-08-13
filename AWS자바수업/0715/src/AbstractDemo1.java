
public class AbstractDemo1 extends Normal1  {
	public AbstractDemo1(String name) {
		super(name);
	}

	public static void main(String[] args) {
//		Normal1 narmal = new Normal1(); // 추상이라서 new를 못슴. 
		Normal1 narmal = new AbstractDemo1("김지민");
		narmal.dispaly();
		
	}

	@Override
	public void dispaly() {
		// TODO Auto-generated method stub
		System.out.println(super.getName());
		
	}
}


abstract class Normal1 {  // 단 하나라도 abstract 메서드가 있으면 abstract 클래스로 해야한다.
	private String name;  //field

	public Normal1(String name) {  // construtor
		this.name = name;
	}

	public abstract void dispaly();  //추상메서드 / 자식이 재정의 , 강제적으로 하기위한 방법 /자식에서 구현부를 만들어야한다/ 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Nomal [name=%s]", name);
	} 
	
}
