import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class CollectionDemo {
	public static void main(String[] args) {
		String [] array = {"한지민","박지민", "홍지민", "한지민", "홍지민","곽지민","신지민"};
//		Set<String> set = new HashSet<String>();
//		for (String element : array) set.add(element);
//		
//		//bulk로 데이터를 추출하고자 할 때 , Enumeration, Iterator
//		Iterator<String> iters = set.iterator();
//		while (iters.hasNext()) {
//			System.out.print(iters.next()+ ",");
//		}
		Vector<String> Vector = new Vector<String>();
		for (String element : array) Vector.add(element);
		Enumeration<String> enums =  Vector.elements();
		while(enums.hasMoreElements()) {
			System.out.print(enums.nextElement() + ",");
		}
	}
}
