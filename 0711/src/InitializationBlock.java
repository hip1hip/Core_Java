
public class InitializationBlock {
	private double weight;  //member variable 
	private char grade;
	{
		this.weight = 100.0; this.grade = 'F';  //초기화 블럭 이게 먼저 입력되고 후에 InitializationBlock 이 덮어씀, 
		System.out.println("나는 초기화 블럭 ");
	}
	public InitializationBlock() { //기본생성자에 오버라이딩
		System.out.println("나는 생성자");
//		this.weight = 62.4;
//		this.grade = 'C';
	}
	public static void main(String[] args) {
		InitializationBlock jimin = new InitializationBlock();
		System.out.println(jimin.weight + "kg");
		System.out.println(jimin.grade);
	}

}
