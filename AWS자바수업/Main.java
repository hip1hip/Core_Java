import kr.seoul.sesac.util.libs.Finance;
import kr.seoul.sesac.util.libs.HumanResource;
import kr.seoul.sesac.util.libs.*;  // * 을 쓰면 다가져온다는 뜻 
//FQDN : Fully Qualified Name(전체경로)

public class Main{
	public static void main(String[] args) {
		Finance f = new Finance();
		HumanResource hr = new HumanResource();
		System.out.println(f.money);
		System.out.println(hr.salary);
	}
}
 