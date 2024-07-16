
public class ExceptionDemo1 {
	public static void main(String[] args) {
		Car matiz = new Car();
		matiz.name = "대우마티즈";
		System.out.println(matiz.name);
		matiz=null;
		try {
			System.out.println(matiz.name);
//		}catch(RuntimeException e) {
//			System.out.println("여기서 잡았음 ");
		}catch(ArrayIndexOutOfBoundsException e) { 
			System.out.println("배열의 범위를 벗어났음. ");
//			System.out.println(e.getMessage());  에러 메세지만 출력 
//			System.out.println(e);  //e.toString() 으로 자동 변환 / 에러메세지와 Exception Type
//			e.printStackTrace();  // 다 볼 수 있는거
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기가 음수면 안됨 ");
		}catch(RuntimeException e) {}
		
	}
}
