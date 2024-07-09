/*
 * 메서드를 호출하는 3가지 방법 
 * 1. Call by Name
 * 2. Call by Value  - name 보단 좀더 업그래이드 버젼. 옵션 추가 () 괄호 안에 뭘 넣는다는게 옵션을 넣는것 , 시작값과 끝값을 넣는다. 
 * 3. Call by Reference
 */

public class MethodDemo1 {
	public static void main(String[] args) {
		MethodDemo1 md = new MethodDemo1();
		md.calcHap(10,50); 
		md.calcHap(1,50); 
		md.calcHap(60,100); 
	} 
	
	void calcHap(int start, int end ){  
		int hap = 0; 	
		for (int i = start ; i<= end; i++) {
			hap +=i;
		}
		System.out.println(start + "부터" + end +" 까지 합은 " +hap + "입니다.");	
	}
}

