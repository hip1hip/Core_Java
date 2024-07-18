/*
 * Collection Framewok와 Lambda Experssion
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo7 {
	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(4,5,1,2,8,9,6);
		List<String> list = Arrays.asList("한강" , "두만강" , "낙동강" , "압록강" , "영산강" , "금강 ");
		
		//1nd way 
//		Collections.sort(list, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer front, Integer back) {
//				// TODO Auto-generated method stub
//				return front - back; //Ascending Sort 
//			}
//			
//		});
		
		//2nd way 
		Collections.sort(list, (front, back) -> front.compareTo(back));
		System.out.println(list);
	}
}
