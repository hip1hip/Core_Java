import java.util.Scanner;

//학생수와 각 학생들의 점수를 입력받아서 촤고 점수 및 평균 점수를 구하는 프로그램
public class Exercise06 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1. 학생수 2.점수입력 3. 점수리스트 4. 분석 5. 종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.print("힉생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
				
			}else if(selectNo == 2) {
				for(int i = 0; i <studentNum; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			
			}else if(selectNo == 3) {
				for(int i = 0; i <scores.length; i++) {
					System.out.println("scores[" + i + "]>" + scores[i]);
				}
				
			}else if(selectNo == 4) {
				int sum =0;  int count = 0;	double avg = 0; int max = 0;
				
				for(int i = 0; i <scores.length; i++) {
					if(scores[i] > max) {
						max = scores[i];
						}
					
					sum += scores[i];
					avg = (double)sum / studentNum;
				}
				System.out.println("최고점수:  " + max);
				System.out.println("평균점수:  " + avg);
			
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		
		
	}
}
