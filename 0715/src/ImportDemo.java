//import kr.seoul.sesac.util.libs.*;
import com.example.libs.Car;

public class ImportDemo extends Car{

	public static void main(String[] args) {
//		Finance f = new Finance();
//		HumanResource hr = new HumanResource();
//		System.out.println(f.money);
//		System.out.println(hr.salary);
		Car sonata = new Car();
		//sonata.price 는 접근 불가 , protected 
		System.out.println(sonata.name);
		
		ImportDemo id = new ImportDemo();
		System.out.println(id.price);
		
	}

}
