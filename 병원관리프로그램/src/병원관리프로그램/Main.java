package 병원관리프로그램;

public class Main {

	public static void main(String[] args) {
		Patient [] array = new Patient[5]; //리스트 생성/ ArrayList는 List 인터페이스를 구현한 구체적인 클래스에요.
		Input input = new Input(array);
		int count = input.input();  //productdata.txt 파일에서 데이터를 읽어와 list에 Product 객체로 저장해요.
//		Calc calc = new Calc(array);
//		calc.calc(); //각 Product 객체의 판매금액, 매입금액, 이익금, 이익율을 계산해요.
//		Sort sort = new Sort(array);
//		sort.quickSort();  //이익금 기준으로 Product 리스트를 내림차순 정렬해요.
//		Output output = new Output(array);
//		output.print();  //정렬된 리스트를 출력해요.
		System.out.println("Program is over...");
	}
}



//	Employee [] array = new Employee[5];
//	Input input = new Input(array);  
//	int count = input.input();
//	Calc calc = new Calc(array, count);    
//	calc.calc();
//	Output output = new Output(array, count);   
//	output.output();
//	System.out.println("Program is over...");
//}
//}