
//동일 클래스에 있는 맴버 변수는 반드시 해당 클래스를 생성해서 그주소로 접근 해야한다.  

public class HelloWorld2 {
	
	String str = "Hello, World"; //instance , member variable  
	
	public static void main(String[] args) {
		//String str = "Hello, World"; // local , stack , temporary , auto variable 
		HelloWorld2 hw = new HelloWorld2();
		System.out.println(hw.str);

		
	}

}
