
public class NstedLoopDemo {

	public static void main(String[] args) {
		//99단
		int i= 1; // i초기화
		while (i <=9 ) { //i 조건
			int dan =2; //초기화
			while (dan <= 9) { //조건
				System.out.print( dan + " x " + i + " = " + dan * i +"\t");
				dan++;  //증감식 
			}
			System.out.println();
			
			i++;
		}

	}

}
