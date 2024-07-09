
public class MethodDemo3 {
	public static void main(String[] args) {
		MethodDemo3 md = new MethodDemo3();
		md.print();
	}
	double print() { //member method  //void를 int 로 바꿔야 리턴 값을 줄 수 있음. , String 이면 스트링 , double 이면 더블 
		System.out.println("Hello, World");
		return 0.0;

				
	} // 메인으로 복귀를 하는데 빈손으로 가는지? 리턴 / void 는 무취 암것도 없음. 
}
