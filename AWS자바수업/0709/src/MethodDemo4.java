
public class MethodDemo4 {
	public static void main(String[] args) {
		MethodDemo4 md = new MethodDemo4();
		int result = md.calcHap(10,50); 
		System.out.println(result);
		result = md.calcHap(1,50); 
		System.out.println(result);
		result = md.calcHap(60,100); 
		System.out.println(result);
	} 
	
	int calcHap(int start, int end ){  
		int hap = 0; 	
		for (int i = start ; i<= end; i++) {
			hap +=i;
		}
		//System.out.println(start + "부터" + end +" 까지 합은 " +hap + "입니다.");	
		return hap;
	}
}

