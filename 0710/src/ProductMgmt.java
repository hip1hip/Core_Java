import java.util.Scanner;

public class ProductMgmt {
	public static void main(String[] args) {
		Product [] stdArray = new Product[7]; //앞으로 학색들의 정보가 저장될 공간 확보
		Scanner sc = new Scanner(new java.io.File("productdata.dat"));
//		Scanner sc = new Scanner(System.in);
		for (int i = 0; i< 4; i++) {
			stdArray[i] = new Product();
			String line = sc.nextLine();
			
			String [] array = line.split("\\s+");
			stdArray[i].name = array[1].trim();  //이름
			stdArray[i].num = Integer.parseInt(array[2].trim());  //수량 
			stdArray[i].panmegum = Integer.parseInt(array[3].trim());  //수량 
			stdArray[i].meim = Integer.parseInt(array[4].trim());  //수량 
		}
		int j = 0; 
		while( j < 4) {
			System.out.printf("%15s\t %5d\t %5d\t %5d %n",
					stdArray[j].name, stdArray[j].num, stdArray[j].panmegum, stdArray[j].meim);
	
		
			j++;
		}
	}
	
	void calc(Product std) {
	std.panmegum = std.num * std.price;
	std.meim = std.num * std.getPrice;
	}
	
}
