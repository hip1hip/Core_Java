//Override Method 는 범위도 따진다 , public 등등 부모보다 자식이 범위가 같거나 커야함, 
public class OverriddeDemo {
	public static void main(String[] args) {
		Base parent = new Derived();	parent.display();
//		Object obj = new Sting("hello, World"); 
	}
}

class Base{
	public void display() { System.out.println("나는 부모 메서드");}
}
class Derived extends Base{
	@Override
	public void display() { System.out.println("나는 자식 메서드");}
	//Override Method 는 범위도 따진다 , public 등등 부모보다 자식이 범위가 같거나 커야함, 
	//public > protected > (default) > private
	//Override 된 자식 메서드의 접근 범위는 부모 메서드보다 같거나 넓어야한다.
} 
