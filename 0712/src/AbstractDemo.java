// 추상 클라스 
// 강제로 다형성을 가지게 하기 위해
public class AbstractDemo {
	public static void main(String[] args) {
		Tiger t = new Lion();  // 불러오는건 자식으로 불러옴. 
		t.display();
	}
}

abstract class Tiger {
	public void print() {System.out.println("나눈 정상적인 메소드 ");} //정상적인 메서드와 추상 메서드가 같이 있어도 된다. / 상속을 겅제화 
	public abstract void display() ; //추상메서드를 하나라도 가지고 있으면 추상클라스로 해야함   
} // 강제로 자식을 가져야한다, 
class Lion extends Tiger {
	public void display() {System.out.println("난 자식메서드 ");
	};
}
