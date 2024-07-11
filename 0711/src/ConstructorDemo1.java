
public class ConstructorDemo1 {

	public static void main(String[] args) {
		MyDate birthday = new MyDate();
		System.out.println(birthday.year);
	}

}
class MyDate{
	int year, month, day; 
	//디폴트 생성자를 고치는걸 , 재정의 하는걸 오버라이딩 
	public MyDate() {
//	this.year=0; this.month=0;  this.day=0; //기본생성자 
	this.year=2024; this.month=7;  this.day=11; 
	
	}
}
