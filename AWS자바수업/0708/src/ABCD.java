
public class ABCD {

	public static void main(String[] args) {
	
		int count = 0 , line =1 ; 
		
		int i = 65; 
		while (i <= 90) {
			
			if(line % 2 == 0) System.out.print((char)(i+32) + "\t"); //소문자 출력 
			else System.out.print((char)i + "\t");  //대문자 출력 
			count++;
			if(count % 5 == 0) {
				System.out.println(); line++;
			}
			 i++;
		}

	}
}
	/*
		public static void main(String[] args) {
	
		int count = 0 , line =1 ; 
		for ( char i = 65; i <= 90; i++) {
			
			if(line % 2 == 0) System.out.print((char)(i+32) + "\t"); //소문자 출력 
			else System.out.printf((char)i + "\t");  //대문자 출력 
			count++;
			if(count % 5 == 0) {
				System.out.println(); line++;
			}
		}

	}

	 */


