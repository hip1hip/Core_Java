import java.util.Scanner;

public class VariableDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수 : ");
		String kor = sc.nextLine();
		int ko = Integer.parseInt(kor);
		System.out.println("수학점수 : ");
		String math = sc.nextLine();
		int ma = Integer.parseInt(math);
		System.out.println(ko + ma); // 숫자가 글씨로 바뀜 7080 등으로 나옴 
	}

}
