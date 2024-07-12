
//2. private 맴버는 상속되지 않는다. 

public class InheritanceDemo1 {
	public static void main(String[] args) {
		Frog f = new Frog();
		f.name = "개구리"; // name 은 오류.
	}

}

class 양서류 {
	private String name;
	int weight;
}
class Frog extends 양서류{
	
}
