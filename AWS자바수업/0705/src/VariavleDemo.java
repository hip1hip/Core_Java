
public class VariavleDemo {
	
	int eng = 100; // 인스턴트 변수 , 스테틱도 없음 메인 밖에 있읍 
	static int math = 80; //class 변수 - > 제일 먼저 메모리에 자동으로 올라옴 

	public static void main(String[] args) {
		int kor = 90; //중괄호 안에 만들어진 변수 지역변수 local 
		
		System.out.printf("수학점수 = %d\n" , math);
		System.out.printf("국어점수 = %d\n" , kor);
		
		VariavleDemo vd = new VariavleDemo(); // vd 는 번지가 저장됨 ,  
		
		System.out.printf("영어점수 = %d\n" , vd.eng ); //eng가 어디 주소인지 모름 그래서 ,vd를 주소 만들어서 vd.eng 로 확인 .
		
		Demo d = new Demo(); // 같은 영어 점수여도 new 로 주소를 새로 설정해주면 된다.
		System.out.printf("영어점수 = %d\n" , d.eng );
	}

}

class Demo {
	int eng = 20;  // 동일한 이름을 새로 만들면? 다시 new  주소 설정하면 됨 
}
