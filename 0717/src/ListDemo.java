//List 는 중복허용 , 인덱스로 접근

import java.util.Vector;

public class ListDemo {
	public static void main(String[] args) {
		String [] array = {"한지민","박지민", "홍지민", "한지민", "홍지민","곽지민","신지민"};
		Vector<String> vector = new Vector<String>(1,1);
		
//		List<String> list = new ArrayList<String>(5);  // 기본적으로 방 10개 생성 자동으로 늘어남 
//		for(String element : array) {
//			list.add(element);
//		}
//		System.out.println("현재 방갯수는 : " + list.size());
//		System.out.println(list);
//		list.remove(0);
//		System.out.println(list);
//		System.out.println(list.get());
	}
}
