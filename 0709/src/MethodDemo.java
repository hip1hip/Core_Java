/*
 * 메서드를 호출하는 3가지 방법 
 * 1. Call by Name - 해당 방법 코드 
 * 2. Call by Value
 * 3. Call by Reference
 */

public class MethodDemo {
	public static void main(String[] args) {
		MethodDemo md = new MethodDemo();
		md.calcHap(); //스테틱이 아니라서 주소로 불러와야함 
		
	} 
	
	//void 무취-리턴값이 없음 , 데이터 타입으로 보지 않음, 
	// 메서드의 필수 3요소: 이름 , 괄호() , 리턴타입. 
	void calcHap(){  // member method 괄호가 있으면 함수 없으면 변수 / 이름앞에 타입은 리턴 타입이 됨. / 메인에서 나누기 위해 메서드를 씀 
		int hap = 0; 	
		for (int i = 1 ; i< 101; i++) {
			hap +=i;
		}
		System.out.println("1부터 100까지 합은 " +hap + "입니다.");	
	}
}
//Naming Convention
/*
 * 1.PascalCasing : Class, Interface , Enum 대문자로 시작 
 * 2.camelCasing : variable , method 소문자로 시작 
 * 대문자와 소문자를 구별하기 위해 
 * 3. Snake_Casing : _ 를 쓰는거 
 * 4. Kebbab-Csing
 */
