import kr.seoul.sesac.util.libs.Finance;
import kr.seoul.sesac.util.libs.HumanResource;
import kr.seoul.sesac.util.libs.*;  // * �� ���� �ٰ����´ٴ� �� 
//FQDN : Fully Qualified Name(��ü���)

public class Main{
	public static void main(String[] args) {
		Finance f = new Finance();
		HumanResource hr = new HumanResource();
		System.out.println(f.money);
		System.out.println(hr.salary);
	}
}
 