
public class AbstractDemo extends Normal {
	public AbstractDemo(String name) {
		super(name);
	}
	public static void main(String[] args) {
		//Normal normal = new Normal("한지민");  //abstract 적으면 오류남 무조건 상소을 받아야함 / extends Normal  추가함 
		Normal normal = new AbstractDemo("한지민"); //형변환 
		System.out.println(normal);  // normal.toString()
	}
}

abstract class Normal{ //abstract 를 붙이면 위에 생성자 오류 / 상속을 강제화 
	private String name;

	public Normal(String name) {
		this.name = name;
	}

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
