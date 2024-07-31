
public class Mammal {
	public void print() {
		System.out.println("나는 포유류다,");
	}
	

	public void 새끼를낳다() {
		System.out.println("새끼를낳다");
	}
	public void 젖을먹이다() {
		System.out.println("젖을먹이다");
	}
}

// 1. 오버 쉐도우 변수
// 2. 오버라이드 메서드 - 메서드의 시그니쳐가 같아서 상속되지 않는다 public void print()가 부모와 자식 다 있는 경우
// 접근주소가 자식 주소라서. 자기 부모 주소를 쓰지 않는다. 본인먼저. 